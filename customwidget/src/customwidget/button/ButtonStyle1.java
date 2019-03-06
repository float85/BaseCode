package customwidget.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.g.customwidget.R;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Button được xây dựng từ TextView <br>
 * bg trong suốt <br>
 * title màu xanh <br>
 * bg chuyển màu sáng nhạt khi press
 * 
 * @author ngo xuan giang
 * 
 */
public class ButtonStyle1 extends TextView {

	public static int[] attrsArray = new int[] { android.R.attr.textSize, // 0
			android.R.attr.textColor, // 1
	};

	public ButtonStyle1(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray ta = context.obtainStyledAttributes(attrs, attrsArray);

		setGravity(Gravity.CENTER);
		// setTypeface(getTypeface(), Typeface.BOLD);
		setText(getText().toString().toUpperCase());
		setBackgroundResource(R.drawable.background_expandlistviewitem_button);
		setPadding(15, 10, 15, 10);

		// setTextSize(TypedValue.COMPLEX_UNIT_SP, ta.getDimension(0, 15));
		setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
		ta.getColor(1, getResources().getColor(R.color.buttonstyle1_titlecolor));
		setTextColor(getResources().getColor(R.color.buttonstyle1_titlecolor));

		ta.recycle();
	}
}
