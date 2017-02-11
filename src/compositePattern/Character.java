package compositePattern;

import java.util.Iterator;

public class Character {
	MenuComponent allMenus;
	
	public Character(MenuComponent allMenus) {
		// TODO Auto-generated constructor stub
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	// 有問題
	public void iteraterPrintMenu() {
		Iterator iterator = allMenus.createIterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}
