package customwidget.dialogshowlog;

import android.app.Dialog;
import android.content.Context;
import android.g.customwidget.R;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class ShowLogDialog extends Dialog {
	Context context;
	TextView tv_message;
	TextView tv_Title;
	TextView tv_Positive;
	TextView tv_Negative;

	public ShowLogDialog(Context context) {
		super(context);
		this.context = context;
		setCancelable(false);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog_showlog);
		WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
		lp.copyFrom(getWindow().getAttributes());
		lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
		lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
		getWindow().setAttributes(lp);
		getWindow().setBackgroundDrawable(new ColorDrawable(0));

		tv_message = (TextView) findViewById(R.id.text_alertdialog_message);
		tv_Title = (TextView) findViewById(R.id.text_alertdialog_title);
		tv_Positive = (TextView) findViewById(R.id.text_alertdialog_possitive);
		tv_Negative = (TextView) findViewById(R.id.text_alertdialog_negative);

		tv_Positive.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				dismiss();
			}
		});
		tv_Negative.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				dismiss();
			}
		});
	}

	public void showMessage(String title, String msg) {
		tv_Negative.setVisibility(View.GONE);
		if (title != null) {
			tv_Title.setText(title);

		}
		if (msg != null) {
			if(msg.length()> 200){
				tv_message.setGravity(Gravity.LEFT);
			}else{
				tv_message.setGravity(Gravity.CENTER);
			}
			tv_message.setText(msg);
		}
		tv_Positive.setText(context.getResources().getString(R.string.XacNhan));

		setOnDismissListener(null);
		show();
	}

	public void showMessage(String title, String msg,
			OnDismissListener onDismissListener) {
		tv_Negative.setVisibility(View.GONE);
		if (title != null) {
			tv_Title.setText(title);
		}
		if (msg != null) {
			tv_message.setText(msg);
		}
		tv_Positive.setText(context.getResources().getString(R.string.XacNhan));
		setOnDismissListener(onDismissListener);
		show();
	}

	public void showMessageWithNegativeButton(String title, String msg,
			OnDismissListener onDismissListener) {
		tv_Negative.setVisibility(View.VISIBLE);
		if (title != null) {
			tv_Title.setText(title);
		}
		if (msg != null) {
			tv_message.setText(msg);
		}
		tv_Positive.setText(context.getResources().getString(R.string.XacNhan));
		setOnDismissListener(onDismissListener);
		show();
	}

}
