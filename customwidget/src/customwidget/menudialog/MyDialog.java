package customwidget.menudialog;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.g.customwidget.R;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import customwidget.menucontrol.entities.MenuControlItem;

@SuppressLint("NewApi")
public class MyDialog extends Dialog {
	public boolean isShow = false;
	ListView listMenu;
	TextView tv_title;
	String title = "";
	List<MenuControlItem> items;
	AdapterMenu adaptermenu;
	OnItemClickListener onItemClick;
	tamgiac tg;
	int marginLeft;
	int marginTop;
	int heightDialog;
	int heightScreen;
	int heightView;
	int YY = 20;
	Context context;

	public MyDialog(Context context, List<MenuControlItem> my_array) {
		super(context);
		this.context = context;
		this.items = my_array;
		adaptermenu = new AdapterMenu(context, items);

	}

	@SuppressLint("NewApi")
	public void init() {
		WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		Display display = wm.getDefaultDisplay();
		heightScreen = display.getHeight();
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fragment_dialog);
		tv_title = (TextView) findViewById(R.id.tv_title);
		tv_title.setText(title);
		// tg.setY(YY);
		listMenu = (ListView) findViewById(R.id.list_item);
		listMenu.setAdapter(adaptermenu);
		tg = (tamgiac) findViewById(R.id.surfaceview);
		listMenu.setOnItemClickListener(onItemClick);

		setCanceledOnTouchOutside(true);
		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
				WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
		w.setFlags(WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
				WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);
		w.setBackgroundDrawable(new ColorDrawable(0));
		w.setDimAmount(0.0f);
		w.setGravity(Gravity.LEFT | Gravity.TOP);

		View item = adaptermenu.getView(0, null, listMenu);
		item.measure(0, 0);
		int totalItemsHeight = item.getMeasuredHeight()
				* (adaptermenu.getCount() + 1);
		int totalDividersHeight = listMenu.getDividerHeight()
				* (adaptermenu.getCount());

		Resources resources = context.getResources();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		int px = 10 * (metrics.densityDpi / 160);
		heightDialog = totalItemsHeight + totalDividersHeight + px;

		if (marginTop + heightDialog > heightScreen) {
			YY = heightDialog - (heightScreen - marginTop) + heightView - 20
					- px / 2;
		} else {
			YY = heightView / 2 - 10 - px / 2;
		}
		tg.setY(YY);

		//getWindow().setLayout(270, heightDialog);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		WindowManager.LayoutParams l = getWindow().getAttributes();
		l.x = marginLeft;
		l.y = marginTop;
		init();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	public void showDialog(View v, int marginLeft, int marginTop) {
		heightView = v.getHeight();
		this.marginLeft = v.getHeight() + marginLeft;
		this.marginTop = (int) v.getY() + marginTop;
		show();
	}

	public void setClickable(final View view) {
		this.setOnShowListener(new OnShowListener() {

			@Override
			public void onShow(DialogInterface arg0) {
				view.setClickable(false);
			}
		});
		this.setOnDismissListener(new OnDismissListener() {

			@Override
			public void onDismiss(DialogInterface arg0) {
				view.setClickable(true);
			}
		});

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_OUTSIDE) {
			dismiss();
		}
		return super.onTouchEvent(event);
	}

	public void setTitle(String s) {
		this.title = s;
	}

	public void setOnItemClick(OnItemClickListener onItemClick) {
		this.onItemClick = onItemClick;
	}
}
