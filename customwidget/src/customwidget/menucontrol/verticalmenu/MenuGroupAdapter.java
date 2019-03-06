package customwidget.menucontrol.verticalmenu;

import java.util.List;

import customwidget.menucontrol.entities.MenuControlItem;
import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * @author giang.ngo
 *
 */
public class MenuGroupAdapter extends ArrayAdapter<MenuControlItem>{
	
	Context context;
	List<MenuControlItem> listItem;
	
	public MenuGroupAdapter(Context context, int resource,
			List<MenuControlItem> objects) {
		super(context, resource, objects);
		this.context = context;
		this.listItem = objects;
	}

}
