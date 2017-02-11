package IteratorPattern;

import java.util.Iterator;
/**
 * ==| Iterator Pattern 反覆器模式 |==
 * 讓我們能夠取得一個Collection裡面的每一個元素，
 * 而不需要將此聚集的實踐方式暴露出來。
 * 
 * 這裡舉例兩種聚集: WeaponMenu(用ArrayList實作)、SkillMenu(用Array實作)。
 * 我們利用java.util.Iterator，在WeaponMenu中使用ArrayList預設的Iterator()，以及使用SkillIterator封裝iterator的功能，
 * 讓反覆器在元素間遊走，而不是讓聚集本身在元素間遊走。
 * 
 * @author coreyou
 *
 */
public class Character {
	Menu weaponMenu;
	Menu skillMenu;
	
	public Character(Menu weaponMenu, Menu skillMenu) {
		// TODO Auto-generated constructor stub
		this.weaponMenu = weaponMenu;
		this.skillMenu = skillMenu;
	}

	public void printMenu() {
		// TODO Auto-generated method stub
		/** WeaponMenu使用ArrayList的實踐方式: size()和get(i)
		ArrayList weaponItems = weaponMenu.getMenuItems();
		for(int i = 0; i < weaponItems.size(); i++) {
			MenuItem menuItem = (MenuItem)weaponItems.get(i);
			System.out.print(menuItem.getName() + " ");
			System.out.print(menuItem.getAttackNumber() + " ");
			System.out.println(menuItem.getPrice());
		}
		*/
		/** SkillMenu使用Array的實踐方式: .length和[i]
		MenuItem[] skillItems = skillMenu.getMenuItems();
		for(int i = 0; i < skillItems.length; i++) {
			MenuItem menuItem = skillItems[i];
			System.out.print(menuItem.getName() + " ");
			System.out.print(menuItem.getAttackNumber() + " ");
			System.out.println(menuItem.getPrice());
		}
		*/
		// 以上兩種不同的實踐方式就需要兩個for迴圈，解決方法是封裝重複動作成Iterator，這樣可以使用同一個for迴圈
		Iterator weaponIterator = weaponMenu.createIterator();
		Iterator skillIterator = skillMenu.createIterator();
		printMenu(weaponIterator);
		System.out.println("");
		printMenu(skillIterator);
	}
	
	public void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + " ");
			System.out.print(menuItem.getAttackNumber() + " ");
			System.out.println(menuItem.getPrice());
		}
	}
	
	
}
