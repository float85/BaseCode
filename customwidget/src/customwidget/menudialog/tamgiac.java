package customwidget.menudialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import android.g.customwidget.R;

public class tamgiac extends View {

	public tamgiac(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public tamgiac(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public tamgiac(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	private int Y = 0;

	public void setY(int Y) {
		this.Y = Y;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
//		Paint paint = new Paint();
//		paint.setColor(Color.BLACK);
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
				R.drawable.icontg);
		canvas.drawBitmap(bitmap, 0, Y, null);
//		canvas.drawLine(0, Y, 20, Y-5, paint);
//		canvas.drawLine(0, Y, 20, Y-5, paint);
//		canvas.drawLine(20, Y-5, 20, 0, paint);
//		canvas.drawLine(0, Y, 20, Y+10, paint);
//		canvas.drawLine(20, Y+10, 20, 1200, paint);
	}

}
