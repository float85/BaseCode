package customwidget.slidemenu;

import android.app.Service;
import android.content.Context;
import android.g.customwidget.R;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideMenuItemView extends LinearLayout {

	ImageView imgview_icon;
	ImageView indicator;
	TextView tv_title;

	public SlideMenuItemView(Context context) {
		super(context);
		((LayoutInflater) context
				.getSystemService(Service.LAYOUT_INFLATER_SERVICE)).inflate(
				R.layout.slidemenu_slidemenuitem, this);
		linkView();

	}

	protected void linkView() {
		tv_title = (TextView) findViewById(R.id.text_slidemenuitem_title);
		imgview_icon = (ImageView) findViewById(R.id.img_slidemenuitem_icon);
		indicator = (ImageView) findViewById(R.id.img_slidemenuitem_indicator);
	}

	public void setData(SlideMenuItem item) {
		imgview_icon.setImageResource(item.getIcon());
		tv_title.setText(item.getTitle());
		this.setActivated(item.isActive());
		if (item.isGroupItem()) {
			indicator.setVisibility(VISIBLE);
			if (item.isExpand()) {
				indicator.setRotation(0);
			} else {
				indicator.setRotation(-90);
			}
		} else {
			indicator.setVisibility(GONE);
		}
	}
}
