package customwidget.animation;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class ViewAnimation extends Animation
{
    private int mWidth;
    private int mStartWidth;
    private View mView;

    public ViewAnimation(View view, int width)
    {
        mView = view;
        mWidth = width;
        mStartWidth = view.getWidth();
    }

    @SuppressLint("NewApi")
	@Override
    protected void applyTransformation(float interpolatedTime, Transformation t)
    {
        int newWidth = mStartWidth + (int) ((mWidth - mStartWidth) * interpolatedTime);
        mView.getLayoutParams().width = newWidth;
        mView.requestLayout();
        mView.requestFitSystemWindows();
    }

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight)
    {
        super.initialize(width, height, parentWidth, parentHeight);
        setDuration(1000);
    }

    @Override
    public boolean willChangeBounds()
    {
        return true;
    }
}

