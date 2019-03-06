package customwidget.menucontrol.verticalmenu;

import java.lang.reflect.Field;

import android.app.Service;
import android.content.Context;
import android.g.customwidget.R;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import customwidget.menucontrol.entities.MenuControlItem;
import customwidget.menucontrol.entities.OnClickItemMenuListener;

/**
 * 
 * @author giang.ngo
 * 
 */
public class LevelOneMenuView extends LinearLayout {
	static final String drawable = "drawable";

	Context context;
	ImageView icon;
	TextView label;
	OnClickItemMenuListener onClickItemMenuListener;
	MenuControlItem item;

	public LevelOneMenuView(Context context, MenuControlItem item) {
		super(context);
		this.context = context;
		this.item = item;
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.levelonemenu_layout, this);
		icon = (ImageView) findViewById(R.id.imgv_levelonemenu_icon);
		setData(item);
		setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				VerticalMenuControl parent = (VerticalMenuControl) v
//						.getParent();
				//parent.setSelectedMenuItem((LevelOneMenuView) v);
//				v.setSelected(true);
				if (onClickItemMenuListener != null) {
					onClickItemMenuListener.onClick(v,
							LevelOneMenuView.this.item);
				}
			}
		});
	}

	public void setData(MenuControlItem item) {
		if (item != null) {
			String name = item.getIconName();
			int resId = getResources().getIdentifier(name, drawable,
					context.getPackageName());
			icon.setImageResource(resId);
			;
		}
	}

	public void setOnClickItemMenuListener(
			OnClickItemMenuListener onClickItemMenuListener) {
		this.onClickItemMenuListener = onClickItemMenuListener;
	}

	public static int getResId(String resName, Class<?> c) {
		try {
			Field idField = c.getDeclaredField(resName);
			return idField.getInt(idField);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
