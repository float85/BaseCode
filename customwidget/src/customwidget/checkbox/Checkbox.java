package customwidget.checkbox;

import android.app.Service;
import android.content.Context;
import android.content.res.TypedArray;
import android.g.customwidget.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Checkbox extends LinearLayout {
	boolean isActive = false;
	String label;
	int activeImageResId;
	int inActiveImageResId;
	private TextView tv_label;
	private ImageView image;
	private OnActiveCheckboxListener onActiveCheckboxListener;

	public static int[] attrsArray = new int[] { android.R.attr.layout_width, // 0
			android.R.attr.layout_height // 1
	};

	public Checkbox(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray typedArray = context.obtainStyledAttributes(attrs,
				R.styleable.Checkbox);
		isActive = typedArray.getBoolean(R.styleable.Checkbox_checkboxActive,
				false);
		label = typedArray.getString(R.styleable.Checkbox_checkboxLabel);
		activeImageResId = typedArray.getResourceId(
				R.styleable.Checkbox_checkboxActiveImg, R.drawable.ic_checked);
		inActiveImageResId = typedArray.getResourceId(
				R.styleable.Checkbox_checkboxInActiveImg,
				R.drawable.ic_unchecked);
		typedArray.recycle();

		TypedArray ta = context.obtainStyledAttributes(attrs, attrsArray);
		int layout_width = ta.getLayoutDimension(0,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		int layout_height = ta.getLayoutDimension(1,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		ta.recycle();
		setLayoutParams(new LayoutParams(layout_width, layout_height));

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.checkbox_checkbox, this);
		image = (ImageView) findViewById(R.id.img_checkbox_image);
		tv_label = (TextView) findViewById(R.id.tv_checkbox_label);

		tv_label.setText(label);
		if (isActive) {
			image.setImageResource(activeImageResId);
		} else {
			image.setImageResource(inActiveImageResId);
		}
		clickForChange();
	}

	private void clickForChange() {
		setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!isActive) {
					isActive = true;
					image.setImageResource(activeImageResId);
				} else {
					isActive = false;
					image.setImageResource(inActiveImageResId);
				}
				if (onActiveCheckboxListener != null) {
					onActiveCheckboxListener.todo(isActive);
				}
			}
		});
	}

	public void setOnActiveCheckboxListener(
			OnActiveCheckboxListener onActiveCheckboxListener) {
		this.onActiveCheckboxListener = onActiveCheckboxListener;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
		if (isActive) {
			image.setImageResource(activeImageResId);
		} else {
			image.setImageResource(inActiveImageResId);
		}
	}

	public boolean isActive() {
		return isActive;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public TextView getLabelTextView() {
		return tv_label;
	}

	public void setActiveImageResId(int activeImageResId) {
		this.activeImageResId = activeImageResId;
	}

	public void setInActiveImageResId(int inActiveImageResId) {
		this.inActiveImageResId = inActiveImageResId;
	}

	public interface OnActiveCheckboxListener {
		public void todo(boolean isActive);
	}

}
