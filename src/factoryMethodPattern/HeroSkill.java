package factoryMethodPattern;

public class HeroSkill extends SpiritSkill {

	@Override
	Spirit createSpirit(String type) {
		// TODO Auto-generated method stub
		Spirit spirit = null;
		if (type.equalsIgnoreCase("Mario")) {
			spirit = new Mario();
		} else if (type.equalsIgnoreCase("Sonic")) {
			spirit = new Sonic();
		}
		return spirit;
	}

}
