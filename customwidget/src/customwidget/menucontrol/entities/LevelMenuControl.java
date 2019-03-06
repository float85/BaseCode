package customwidget.menucontrol.entities;

/**
 * @author giang.ngo LEVELMENU.LevelFirstMenu : menu cap 1
 *         LEVELMENU.LevelSecondMenu : menu cap 2
 * 
 */
public enum LevelMenuControl {
	LevelFirst(1), LevelSecond(2);
	private int level;

	private LevelMenuControl(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

}