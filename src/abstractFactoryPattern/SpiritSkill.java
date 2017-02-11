package abstractFactoryPattern;

public class SpiritSkill {
	SpiritFactory spiritFactory;
	
	public SpiritSkill(SpiritFactory factory) {
		this.spiritFactory = factory;
	}
	
	public Spirit spiritFireball() {
		Spirit spirit = spiritFactory.createSpirit();

		spirit.fireballSpell();
		
		return spirit;
	}
}
