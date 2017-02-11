package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 以ArrayList實踐，相對於SkillMenu是以Array實踐。
 * 
 * @author coreyou
 *
 */
public class WeaponMenu implements Menu {
	ArrayList menuItems;
	
	public WeaponMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new ArrayList();
		addItem("sword", 5, 500);
		addItem("axe", 7, 950);
	}

	public void addItem(String weaponName, int attackNumber, double price) {
		// TODO Auto-generated method stub
		MenuItem menuItem = new MenuItem(weaponName, attackNumber, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		// ArrayList有內建取得Iterator的方法，所以不必另外創WeaponIterator的class
		return menuItems.iterator();
	}

}
