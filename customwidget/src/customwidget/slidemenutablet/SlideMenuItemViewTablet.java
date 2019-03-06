package customwidget.slidemenutablet;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.g.customwidget.R;
import android.g.customwidget.R.color;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import customwidget.slidemenu.SlideMenuItem;

public class SlideMenuItemViewTablet extends LinearLayout {
	ImageView icon_menu;
	TextView tv_title;
	static final String drawable = "drawable";
	SlideMenuItem item;
	RelativeLayout layout_item;
	View divider;
	Context context;

	public SlideMenuItemViewTablet(Context context, SlideMenuItem item) {
		super(context);
		this.context = context;
		this.item = item;
		((LayoutInflater) context
				.getSystemService(Service.LAYOUT_INFLATER_SERVICE)).inflate(
				R.layout.slidemenutablet_item, this);
		linkView();

	}

	protected void linkView() {
		icon_menu = (ImageView) findViewById(R.id.icon_menu);
		tv_title = (TextView) findViewById(R.id.text_slidemenuitem_title);
		layout_item = (RelativeLayout) findViewById(R.id.layout_item);
		divider = (View) findViewById(R.id.divider);
	}

	@SuppressLint("NewApi")
	public void setData(SlideMenuItem item) {
		if (item.getIcon() > 0) {
			tv_title.setAllCaps(true);
			tv_title.setTypeface(null, Typeface.BOLD);
			icon_menu.setImageResource(item.getIcon());
			layout_item.setBackgroundResource(color.bg_item_parent);
			if (!item.isActive()) {
				divider.setVisibility(View.GONE);
				layout_item.setBackgroundResource(color.bg_item_parent);
				tv_title.setTextColor(Color.parseColor("#FFFFFF"));
			} else {
				divider.setVisibility(View.VISIBLE);
				layout_item.setBackgroundResource(color.bg_item_childs);
				//Sua ma mau khi active thang cha o day 
				tv_title.setTextColor(Color.parseColor("#FFFFFF"));
			}
		} else {
			layout_item.setBackgroundResource(color.bg_item_childs);
			tv_title.setAllCaps(false);
			tv_title.setTypeface(null, Typeface.NORMAL);
			divider.setVisibility(View.VISIBLE);
			if (!item.isActive()) {
				icon_menu
						.setImageResource(android.g.customwidget.R.drawable.icon_item_childs);
				 tv_title.setTextColor(Color.parseColor("#FFFFFF"));
			} else {
				icon_menu
						.setImageResource(android.g.customwidget.R.drawable.ic_dot_nullclassname_active);
				//Sua ma mau khi active thang con o day 
				tv_title.setTextColor(Color.parseColor("#FFFFFF"));
			}
		}
		tv_title.setText(item.getTitle());
		this.setActivated(item.isActive());
	}

	@Override
	public void setActivated(boolean activated) {
		super.setActivated(activated);
	}
}
