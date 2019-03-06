package customwidget.listviewitem;

import android.g.customwidget.R;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout.LayoutParams;

public class ExpandAnimation extends Animation {
	View view;
	int duration;
	LayoutParams mViewLayoutParams;
	private boolean mIsVisibleAfter = false;
	int mMarginStart;
	int mMarginEnd;
	View parentView;
	int backgroundColorWhenCollapse = R.color.transparent;
	int backgroundColorWhenExpand = R.color.expand_listview_item_selected_background;

	public ExpandAnimation(View parent, View v, int duration) {
		setDuration(duration);
		this.view = v;
		this.duration = duration;
		this.parentView = parent;
		mViewLayoutParams = (LayoutParams) v.getLayoutParams();
		int margin = -(v.getHeight());
		mMarginStart = mViewLayoutParams.bottomMargin;
		if (mMarginStart <= margin) {
			// is colapse
			mMarginEnd = 0;
		} else {
			mMarginEnd = -(v.getHeight());
			mIsVisibleAfter = true;
		}
		view.setVisibility(View.VISIBLE);
		setAnimationListener(new AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {
				if (mMarginEnd == 0) {
					parentView.setBackgroundResource(backgroundColorWhenExpand);
				} else {
					parentView.setBackgroundResource(backgroundColorWhenCollapse);
				}
			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
			}
		});
	}

	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {
		super.applyTransformation(interpolatedTime, t);
		if (interpolatedTime < 1.0f) {
			// Calculating the new bottom margin, and setting it
			mViewLayoutParams.bottomMargin = mMarginStart
					+ (int) ((mMarginEnd - mMarginStart) * interpolatedTime);
			// Invalidating the layout, making us seeing the changes we made
			view.requestLayout();

			// Making sure we didn't run the ending before (it happens!)
		} else {
			mViewLayoutParams.bottomMargin = mMarginEnd;
			view.requestLayout();

			if (mIsVisibleAfter) {
				view.setVisibility(View.GONE);
			}
		}
	}
}
