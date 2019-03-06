package customwidget.menudialog;

import java.util.List;

import android.content.Context;
import android.g.customwidget.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import customwidget.menucontrol.entities.MenuControlItem;

public class AdapterMenu extends BaseAdapter {
	private int selectedItem = -1;
	static final String drawable = "drawable";
	private Context context;
    private LayoutInflater inflater;
    private List<MenuControlItem> Items;
    public AdapterMenu(Context context, List<MenuControlItem> Items){
        this.context = context;
        this.Items = Items;
    }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Items.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return Items.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		if (inflater == null)
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.item_menu, null);
//        LinearLayout activeItem = (LinearLayout)convertView;
//        if(arg0 == selectedItem){
//        	activeItem.setBackgroundResource(R.color.item_active);
//        }else{
//        	activeItem.setBackgroundResource(R.color.item_inactive);
//        }
        TextView text = (TextView)convertView.findViewById(R.id.text);
        ImageView icon = (ImageView)convertView.findViewById(R.id.icon);
        MenuControlItem m = Items.get(arg0);
        text.setText(m.getTitle());
        if (m.getIconName() != null) {
			String name = m.getIconName();
			int resId = context.getResources().getIdentifier(name, drawable,
					context.getPackageName());
			icon.setImageResource(resId);
			;
		}
		return convertView;
	}
	
	public void setSelectedItem(int position){
		selectedItem = position;
	}
}
