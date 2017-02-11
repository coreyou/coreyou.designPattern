package simpleFactoryPattern;

public class SpiritSkill {
	SpiritFactory factory;
	
	public SpiritSkill(SpiritFactory factory) {
		this.factory = factory;
	}
	
	public Spirit spiritJumpMove(String type) {
		Spirit spirit;
		spirit = SpiritFactory.createSpirit(type);

		spirit.performJump();
		spirit.performMove();
		
		return spirit;
	}
}
