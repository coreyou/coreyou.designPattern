package factoryMethodPattern;

public class testFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiritSkill heroSkill = new HeroSkill();
		heroSkill.spiritJumpMove("Sonic");
		heroSkill.spiritJumpMove("Mario");
		SpiritSkill monsterSkill = new MonsterSkill();
		monsterSkill.spiritJumpMove("Dragon");
		monsterSkill.spiritJumpMove("Zombie");
	}

}
