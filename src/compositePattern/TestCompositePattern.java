package compositePattern;

public class TestCompositePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent skillMenu = new Menu("skillSystem");
		MenuComponent fireSkillMenu = new Menu("fireSystem");
		MenuComponent waterSkillMenu = new Menu("waterSystem");
		MenuComponent weaponMenu = new Menu("weaponSystem");
		MenuComponent allMenus = new Menu("ALL MENUS");	// 最上層的菜單
		MenuComponent fireBall = new MenuItem("fireBall", 150, 900.0);
		
		// 建立樹狀結構: all menus -┬- skill menu -┬- fire skill menu - fire ball
		//                         │              └- water skill menu
		//                         └------ weapon menu
		allMenus.add(skillMenu);
		allMenus.add(weaponMenu);		
		skillMenu.add(fireSkillMenu);
		skillMenu.add(waterSkillMenu);
		fireSkillMenu.add(fireBall);
		
		Character character = new Character(allMenus);
		character.printMenu();	// 印出的順序: ALL MENUS > skillSystem > fireSystem > fireBall > waterSystem > weaponSystem
		System.out.println("========================");
		character.iteraterPrintMenu();	// skillSystem > fireSystem > fireBall > waterSystem > fireSystem > fireBall*3 > waterSystem > weaponSystem
	}

}
