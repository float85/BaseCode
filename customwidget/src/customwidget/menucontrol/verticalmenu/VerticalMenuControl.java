package customwidget.menucontrol.verticalmenu;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import customwidget.menucontrol.entities.MenuControlItem;
import customwidget.menucontrol.entities.OnClickItemMenuListener;

/**
 * Menu dang doc, khi click vao menuitem se mo mot man hinh chuc nang, hoac show
 * ra popup cac menu con
 * 
 * @author giang.ngo
 * 
 */
public class VerticalMenuControl extends LinearLayout {

	Context context;
	List<MenuControlItem> list_LevelOneMenu;
	Map<Integer, List<MenuControlItem>> map_ChildMenu;
	ArrayAdapter<?> adapter;
	OnClickItemMenuListener onClickItemMenuListener;
	LevelOneMenuView selectedMenuItem;

	public VerticalMenuControl(Context context) {
		super(context);
		configMenu();
	}

	public VerticalMenuControl(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		configMenu();
	}

	public VerticalMenuControl(Context context, AttributeSet attrs) {
		super(context, attrs);
		configMenu();
	}

	public void setDataForMenu(List<MenuControlItem> list_LevelOneMenu,
			Map<Integer, List<MenuControlItem>> map_ChildMenu,OnClickItemMenuListener onClickItemMenuListener) {
		int width = this.getLayoutParams().width;
		this.list_LevelOneMenu = list_LevelOneMenu;
		this.map_ChildMenu = map_ChildMenu;
		if (this.list_LevelOneMenu != null) {
			int count = this.list_LevelOneMenu.size();
			for (int i = 0; i < count; i++) {
				MenuControlItem item = this.list_LevelOneMenu.get(i);
				LevelOneMenuView view = new LevelOneMenuView(context, item);
				view.setOnClickItemMenuListener(onClickItemMenuListener);
				view.setLayoutParams(new LayoutParams(width, width));
				this.addView(view);
			}
		}
	}

	private void configMenu() {
		context = getContext();
		setOrientation(LinearLayout.VERTICAL);
	}

	public void setSelectedMenuItem(LevelOneMenuView selectedMenuItem) {
		if (this.selectedMenuItem != null) {
			this.selectedMenuItem.setSelected(false);
		}
		this.selectedMenuItem = selectedMenuItem;
	}

	public LevelOneMenuView getSelectedMenuItem() {
		return selectedMenuItem;
	}

	public int getSelectedMenuItemPosition() {
		return indexOfChild(selectedMenuItem);
	}
	public LevelOneMenuView getSelectedMenuItem(int selected){
		return (LevelOneMenuView) getChildAt(selected);
	}

}
