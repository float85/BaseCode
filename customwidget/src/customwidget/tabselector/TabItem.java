package customwidget.tabselector;

import android.app.Service;
import android.content.Context;
import android.content.res.TypedArray;
import android.g.customwidget.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TabItem extends RelativeLayout {

	public TextView text;
	public View line;

	public TabItem(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView(context);
		TypedArray typedArray = context.obtainStyledAttributes(attrs,
				R.styleable.TabItem);
		text = (TextView) findViewById(R.id.text_tabitem);
		if (typedArray.getString(0) != null) {
			text.setText(typedArray.getString(0));
		}
		line = findViewById(R.id.line_tabitem);
		setSelected(false);
	}

	public void initView(Context context) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.tabselector_tabitem, this);
	}

	public void setText(String str) {
		this.text.setText(str);
	}

	@Override
	public void setSelected(boolean selected) {
		super.setSelected(selected);
		setActivated(selected);
		text.setActivated(selected);
		if (selected) {
			line.setVisibility(VISIBLE);
		} else {
			line.setVisibility(INVISIBLE);
		}
	}
}
