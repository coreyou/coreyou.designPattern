package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 以Array實踐，相對於WeaponMenu是以ArrayList實踐。
 * 因為是以Array實踐，所以要另外去實作與Iteratro相關的method。
 * 
 * @author coreyou
 *
 */
public class SkillMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public SkillMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("fireBall", 45, 1000);
		addItem("Blizzard", 70, 8900);
	}

	public void addItem(String weaponName, int attackNumber, double price) {
		// TODO Auto-generated method stub
		MenuItem menuItem = new MenuItem(weaponName, attackNumber, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	
	/** 不需要這個method，因為他會將內部實踐的方式暴露在外。
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	*/

	@Override
	public Iterator<?> createIterator() {
		// TODO Auto-generated method stub
		return new SkillIterator(menuItems);
	}

}
