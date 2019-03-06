package customwidget.slidemenutablet;

import java.util.ArrayList;
import java.util.List;

import android.app.Service;
import android.content.Context;
import android.content.res.TypedArray;
import android.g.customwidget.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import customwidget.slidemenu.SlideMenuItem;

public class SlideMenuTablet extends LinearLayout {
	static SlideMenuItem NO_ITEM_IS_EXPANDED = null;
	static SlideMenuItem NO_ITEM_IS_ACTIVED = null;
	public SlideMenuItem currentItemExpand;
	public SlideMenuItem currentItemSelected;
	OnClickItemListener onClickItemListener;
	private SlideMenuItem groupActive = null;
	ImageView icon_menu;
	public View leftFrame;
	int width, widthOpen;
	public ListView lv_menu;
	public Boolean isOpen = false;
	public List<SlideMenuItem> dataSlideMenu;
	public List<SlideMenuItem> dataListViewMenu = new ArrayList<SlideMenuItem>();
	public SlideMenuTabletAdapter adapter;
	public static int[] attrsArray = new int[] { android.R.attr.layout_width, // 0
			android.R.attr.layout_height // 1
	};

	public SlideMenuTablet(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray ta = context.obtainStyledAttributes(attrs, attrsArray);
		int layout_width = ta.getLayoutDimension(0,
				ViewGroup.LayoutParams.MATCH_PARENT);
		int layout_height = ta.getLayoutDimension(1,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		ta.recycle();
		setLayoutParams(new LayoutParams(layout_width, layout_height));

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.slidemenutablet, this);
		lv_menu = (ListView) findViewById(R.id.lv_slidemenu_menu);
		adapter = new SlideMenuTabletAdapter(context,
				android.R.layout.simple_list_item_1, dataListViewMenu);
		lv_menu.setAdapter(adapter);

		initListener();
	}

	public void initData(List<SlideMenuItem> listItem) {
		dataSlideMenu = listItem;
		collapseAll();
	}

	public void collapseAll() {
		dataListViewMenu.clear();
		int countDataSlideMenu = dataSlideMenu.size();
		for (int i = 0; i < countDataSlideMenu; i++) {
			SlideMenuItem item = dataSlideMenu.get(i);
			if (item.getGroupParent() == null) {
				dataListViewMenu.add(item);
				if (item.isGroupItem()) {
					item.setExpand(false);
				}
			}
		}
		adapter.notifyDataSetChanged();
	}

	public void initListener() {

		lv_menu.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				SlideMenuItem itemClick = dataListViewMenu.get(position);
				if (itemClick.isGroupItem()) {
					if (itemClick.isExpand()) {
						// closeMenu();
						collapseGroupItem(itemClick);
					} else {
						openMenu();
						expandGroupItem(itemClick);
					}
				} else {
					groupActive = null;
					selectedItem(itemClick);
				}
			}
		});
	}

	public void expandGroupItem(SlideMenuItem groupItem) {

		if (groupItem != null && !groupItem.isExpand()) {

			collapseGroupItem(currentItemExpand);
			groupItem.setExpand(true);
			currentItemExpand = groupItem;

			List<SlideMenuItem> listChildItem = groupItem.getArrayChildItem();
			if (listChildItem != null) {
				int count = listChildItem.size();
				int positionGroup = dataListViewMenu.indexOf(groupItem);
				for (int i = 0; i < count; i++) {
					dataListViewMenu.add(positionGroup + 1 + i,
							listChildItem.get(i));
				}
			}

			adapter.notifyDataSetChanged();
		}
	}

	public void collapseGroupItem(SlideMenuItem groupItem) {
		if (groupItem != null && groupItem.isExpand()) {

			// collapse item
			groupItem.setExpand(false);
			currentItemExpand = NO_ITEM_IS_EXPANDED;

			// remove childItem khá»�i slidemenu
			List<SlideMenuItem> listChildItem = groupItem.getArrayChildItem();
			if (listChildItem != null) {
				int count = listChildItem.size();
				for (int i = 0; i < count; i++) {
					dataListViewMenu.remove(listChildItem.get(i));
				}
			}

			adapter.notifyDataSetChanged();
		}
	}

	public void selectedItem(SlideMenuItem childItem) {
		if (childItem != null) {
			// bá»� select current item hiá»‡n táº¡i
			unSelectedItem(currentItemSelected);
			childItem.setActive(true);
			currentItemSelected = childItem;
			SlideMenuItem groupParent = childItem.getGroupParent();
			if (groupParent != null) {
				groupParent.setActive(true);
				groupActive = groupParent;
			}
			adapter.notifyDataSetChanged();
			if (onClickItemListener != null) {
				onClickItemListener.todo(childItem.getRepresentClassName(),
						childItem.getTitle());
			}
		}
	}

	public void selectedItemNotPerformClick(SlideMenuItem childItem) {
		if (childItem != null) {
			// bá»� select current item hiá»‡n táº¡i
			unSelectedItem(currentItemSelected);
			childItem.setActive(true);
			currentItemSelected = childItem;
			SlideMenuItem groupParent = childItem.getGroupParent();
			if (groupParent != null) {
				groupParent.setActive(true);
			}
			expandGroupItem(groupParent);
			adapter.notifyDataSetChanged();
		}
	}

	public void unSelectedItem(SlideMenuItem childItem) {
		if (childItem != null) {
			// bá»� select childItem vÃ  groupItem tÆ°Æ¡ng á»©ng
			childItem.setActive(false);
			currentItemSelected = NO_ITEM_IS_ACTIVED;
			SlideMenuItem groupParent = childItem.getGroupParent();
			if (groupParent != null) {
				groupParent.setActive(false);
			}
			adapter.notifyDataSetChanged();
		}
	}

	/**
	 * tá»± active menu tÆ°Æ¡ng á»©ng theo mÃ n class Ä‘ang hiá»ƒn thá»‹
	 * 
	 * @param representClassName
	 */
	public void setStateForSlideMenu(String representClassName) {
		int count = dataSlideMenu.size();
		for (int i = 0; i < count; i++) {
			SlideMenuItem item = dataSlideMenu.get(i);
			if (item.getRepresentClassName().equals(representClassName)) {
				selectedItemNotPerformClick(item);
				groupActive = item.getGroupParent();
				return;
			}
		}
		collapseAll();
	}

	public void onRefreshMenu() {
		setStateForSlideMenu(currentItemSelected.getRepresentClassName());
	}

	public void setOnClickItemListener(OnClickItemListener onClickItemListener) {
		this.onClickItemListener = onClickItemListener;
	}

	public interface OnClickItemListener {
		public void todo(String representFuncName, String title);
	}

	public void openMenu() {
		if (isOpen == false) {
			if (groupActive != null) {
				expandGroupItem(groupActive);
			}
			ResizeWidthAnimation anim = new ResizeWidthAnimation(leftFrame, widthOpen);
			anim.setDuration(200);
			leftFrame.startAnimation(anim);
			isOpen = true;
			icon_menu.setImageResource(R.drawable.icon_menu_open);
		}
	}

	public void closeMenu() {
		if (isOpen) {
			ResizeWidthAnimation anim = new ResizeWidthAnimation(leftFrame,
					width);
			anim.setDuration(200);
			leftFrame.startAnimation(anim);
			isOpen = false;
			icon_menu.setImageResource(R.drawable.ic_menu_new);
			anim.setAnimationListener(new AnimationListener() {

				@Override
				public void onAnimationStart(Animation arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onAnimationRepeat(Animation arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onAnimationEnd(Animation arg0) {
					// TODO Auto-generated method stub
					collapseAll();
				}
			});

		}
	}

	public void setWidth(int width,int widthOpen, View layoutLeft) {
		this.width = width;
		this.widthOpen = widthOpen;
		leftFrame = layoutLeft;

	}

	public void setIconMenu(ImageView icon) {
		icon_menu = icon;
		icon_menu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (isOpen) {
					closeMenu();

				} else {
					openMenu();

				}
			}
		});
	}

	public void clearMenu() {
		groupActive = null;
		currentItemSelected.setActive(false);
		if (currentItemSelected.getGroupParent() != null) {
			currentItemSelected.getGroupParent().setActive(false);
		}
		closeMenu();
	}
}
