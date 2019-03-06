package customwidget.menucontrol.entities;

import java.util.List;

import android.graphics.drawable.Drawable;

/**
 * 
 * @author giang.ngo
 * 
 */
public class MenuControlItem {
	private String clazzName;
	private int keyId;
	private String title;
	private List<MenuControlItem> childs;
	private LevelMenuControl menuLevel;
	private String iconName;

	public MenuControlItem() {
		super();
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public int getKeyId() {
		return keyId;
	}

	public void setKeyId(int keyId) {
		this.keyId = keyId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<MenuControlItem> getChilds() {
		return childs;
	}

	public void setChilds(List<MenuControlItem> childs) {
		this.childs = childs;
	}

	public LevelMenuControl getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(LevelMenuControl menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

}
