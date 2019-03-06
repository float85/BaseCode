package customwidget.slidemenutablet;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import customwidget.slidemenu.SlideMenuItem;

public class SlideMenuTabletAdapter extends ArrayAdapter<SlideMenuItem> {
	Context context;
	List<SlideMenuItem> list;

	public SlideMenuTabletAdapter(Context context, int resource,
			List<SlideMenuItem> objects) {
		super(context, resource, objects);
		this.context = context;
		this.list = objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = new SlideMenuItemViewTablet(context,
					list.get(position));
		}
		((SlideMenuItemViewTablet) convertView).setData(list.get(position));
		return convertView;
	}

}
