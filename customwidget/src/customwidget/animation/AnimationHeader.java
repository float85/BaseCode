package customwidget.animation;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.TextView;

public class AnimationHeader extends Animation{
	public TextView tv;
	public String text;
	public AnimationHeader(TextView tv){
		this.tv = tv;
		this.text = tv.getText().toString();
		tv.setText(getTrimmedText(text, 13, "..."));
	}
	public CharSequence getTrimmedText(CharSequence originalText, int trimLength, String ELLIPSIS) {
        if (originalText != null && originalText.length() > trimLength) {
            return new SpannableStringBuilder(originalText, 0, trimLength + 1).append(ELLIPSIS);
        } else {
            return originalText;
        }
    }
	public void animationHeader(final TextView tv){
		tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ViewAnimation animation = new ViewAnimation(tv,35);
				animation.setAnimationListener(new AnimationListener() {
					
					@Override
					public void onAnimationStart(Animation arg0) {
						// TODO Auto-generated method stub
						tv.setText(getTrimmedText(text, 20, "..."));
					}
					
					@Override
					public void onAnimationRepeat(Animation arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationEnd(Animation arg0) {
						// TODO Auto-generated method stub
						tv.setText(getTrimmedText(text, 13, "..."));
					}
				});
				v.startAnimation(animation);
			}
		});
	}
}
