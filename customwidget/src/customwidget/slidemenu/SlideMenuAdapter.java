package customwidget.slidemenu;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class SlideMenuAdapter extends ArrayAdapter<SlideMenuItem> {
	Context context;
	List<SlideMenuItem> list;

	public SlideMenuAdapter(Context context, int resource,
			List<SlideMenuItem> objects) {
		super(context, resource, objects);
		this.context = context;
		this.list = objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = new SlideMenuItemView(context);
		}
		((SlideMenuItemView) convertView).setData(list.get(position));
		return convertView;
	}

}
