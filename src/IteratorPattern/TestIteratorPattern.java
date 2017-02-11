package IteratorPattern;

public class TestIteratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeaponMenu weaponMenu = new WeaponMenu();
		SkillMenu skillMenu = new SkillMenu();
		
		Character character = new Character(weaponMenu, skillMenu);
		character.printMenu();
	}

}
