package customwidget.slidemenu;

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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;

public class SlideMenu extends LinearLayout {

    static SlideMenuItem NO_ITEM_IS_EXPANDED = null;
    static SlideMenuItem NO_ITEM_IS_ACTIVED = null;
    private SlideMenuItem currentItemExpand;
    private SlideMenuItem currentItemSelected;
    OnClickItemListener onClickItemListener;

    private ListView lv_menu;

    private List<SlideMenuItem> dataSlideMenu;
    private List<SlideMenuItem> dataListViewMenu = new ArrayList<SlideMenuItem>();
    private SlideMenuAdapter adapter;

    public static int[] attrsArray = new int[]{android.R.attr.layout_width, // 0
            android.R.attr.layout_height // 1
    };

    public SlideMenu(Context context, AttributeSet attrs) {
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
        inflater.inflate(R.layout.slidemenu_slidemenu, this);
        lv_menu = (ListView) findViewById(R.id.lv_slidemenu_menu);
        adapter = new SlideMenuAdapter(context,
                android.R.layout.simple_list_item_1, dataListViewMenu);
        lv_menu.setAdapter(adapter);
        initListener();
    }

    public void initData(List<SlideMenuItem> listItem) {
        dataSlideMenu = listItem;
        collapseAll();
    }

    /**
     * tráº£ vá»� tráº¡ng thÃ¡i thu gá»�n nháº¥t cá»§a menu
     */
    private void collapseAll() {
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

    private void initListener() {
        lv_menu.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                SlideMenuItem itemClick = dataListViewMenu.get(position);
                if (itemClick.isGroupItem()) {
                    // náº¿u lÃ  groupItem thÃ¬ expand hoáº·c collapse
                    if (itemClick.isExpand()) {
                        // collapse
                        collapseGroupItem(itemClick);
                    } else {
                        // expand
                        expandGroupItem(itemClick);
                    }
                } else {
                    // náº¿u lÃ  childItem thÃ¬ actived
                    selectedItem(itemClick);
                }
            }
        });
    }

    public void expandGroupItem(SlideMenuItem groupItem) {
        if (groupItem != null && !groupItem.isExpand()) {

            // expandItem
            collapseGroupItem(currentItemExpand);
            groupItem.setExpand(true);
            currentItemExpand = groupItem;

            // add childItem vÃ o slidemenu
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
            }
            adapter.notifyDataSetChanged();
            if (onClickItemListener != null) {
                onClickItemListener.todo(childItem.getRepresentClassName());
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
        collapseAll();
        int count = dataSlideMenu.size();
        for (int i = 0; i < count; i++) {
            SlideMenuItem item = dataSlideMenu.get(i);
            if (item.getRepresentClassName().equals(representClassName)) {
                selectedItemNotPerformClick(item);
                return;
            }
        }

    }

    public void onRefreshMenu() {
        setStateForSlideMenu(currentItemSelected.getRepresentClassName());
    }

    public void setOnClickItemListener(OnClickItemListener onClickItemListener) {
        this.onClickItemListener = onClickItemListener;
    }

    public interface OnClickItemListener {
        public void todo(String representFuncName);
    }
}
