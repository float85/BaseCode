package customwidget.listviewitem;

import android.annotation.SuppressLint;
import android.content.Context;
import android.g.customwidget.R;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;

public class ExpandListviewItem extends LinearLayout {
	public OnItemClickListener onItemClickListener;
	ViewGroup expandView;
	Object item;
	int backgroundColorWhenCollapse = R.color.transparent;
	int backgroundColorWhenExpand = R.color.expand_listview_item_selected_background;

	public ExpandListviewItem(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public interface OnItemClickListener {
		public void onClick(Object item);
	}

	public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
		this.onItemClickListener = onItemClickListener;
	}

	public void expandLayoutButton() {
		if (expandView != null) {
			// Creating the expand animation for the item
			ExpandAnimation expandAni = new ExpandAnimation(this, expandView,
					300);

			// Start the animation on the toolbar
			expandView.startAnimation(expandAni);
		}
	}

	@SuppressLint("NewApi")
	public void collapseLayoutButton(View expand) {
		if (expand != null) {
			((LinearLayout.LayoutParams) expand.getLayoutParams()).bottomMargin = -(getResources()
					.getDimensionPixelSize(R.dimen.expand_listview_item_height));
			expand.setVisibility(View.GONE);
			this.setBackground(expandView.getBackground());
		}
	}

	public void collapseLayoutButton(View expand, int heightExpandView) {
		if (expand != null) {
			((LinearLayout.LayoutParams) expand.getLayoutParams()).bottomMargin = -heightExpandView;
			expand.setVisibility(View.GONE);
			this.setBackgroundResource(backgroundColorWhenCollapse);
		}
	}

	public void collapseLayoutButton() {
		if (expandView != null) {
			collapseLayoutButton(expandView);
		}
	}

	public void setExpandView(ViewGroup expandView) {
		this.expandView = expandView;
	}

	public void setItem(Object item) {
		this.item = item;
	}

}
