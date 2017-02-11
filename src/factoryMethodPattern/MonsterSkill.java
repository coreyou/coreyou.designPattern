package factoryMethodPattern;

public class MonsterSkill extends SpiritSkill {

	@Override
	Spirit createSpirit(String type) {
		// TODO Auto-generated method stub
		Spirit spirit = null;
		if (type.equalsIgnoreCase("Dragon")) {
			spirit = new Dragon();
		} else if (type.equalsIgnoreCase("Zombie")) {
			spirit = new Zombie();
		}
		return spirit;
	}

}
