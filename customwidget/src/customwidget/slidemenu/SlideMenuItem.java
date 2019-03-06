package customwidget.slidemenu;

import java.util.ArrayList;
import java.util.List;

public class SlideMenuItem {
	int icon;
	String title;

	private boolean active = false;
	private boolean expand = false;
	private boolean isGroupItem = false;
	private String representClassName;
	private SlideMenuItem groupParent;
	private List<SlideMenuItem> listChildItem;

	public SlideMenuItem(int icon, String title, boolean isGroupItem,
			String representClassName, SlideMenuItem groupParent) {
		super();
		this.icon = icon;
		this.title = title;
		this.isGroupItem = isGroupItem;
		setGroupParent(groupParent);
		this.representClassName = representClassName;
	}

	public int getIcon() {
		return icon;
	}

	public String getTitle() {
		return title;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isExpand() {
		return expand;
	}

	public void setExpand(boolean expand) {
		this.expand = expand;
	}

	public boolean isGroupItem() {
		return isGroupItem;
	}

	public void setGroupItem(boolean isGroupItem) {
		this.isGroupItem = isGroupItem;
	}

	public String getRepresentClassName() {
		return representClassName;
	}

	public SlideMenuItem getGroupParent() {
		return groupParent;
	}

	public void setGroupParent(SlideMenuItem groupParent) {
		this.groupParent = groupParent;
		if (groupParent != null) {
			groupParent.addToListChild(this);
		}
	}

	public List<SlideMenuItem> getArrayChildItem() {
		return listChildItem;
	}

	public void addToListChild(SlideMenuItem item) {
		if (item != null) {
			if (listChildItem == null) {
				listChildItem = new ArrayList<SlideMenuItem>();
			}
			listChildItem.add(item);
		}
	}

}
