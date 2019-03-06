package customwidget.contextmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.g.customwidget.R;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class BoundedLinearLayout extends LinearLayout {

	int mMaxHeight;

	public BoundedLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs,
				R.styleable.BoundedLinearLayout);
		mMaxHeight = a.getDimensionPixelSize(
				R.styleable.BoundedLinearLayout_maxheight, 0);
		a.recycle();
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// Adjust height as necessary
		int measuredHeight = MeasureSpec.getSize(heightMeasureSpec);
		if (mMaxHeight > 0 && mMaxHeight < measuredHeight) {
			int measureMode = MeasureSpec.getMode(heightMeasureSpec);
			heightMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxHeight,
					measureMode);
		}
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

}
