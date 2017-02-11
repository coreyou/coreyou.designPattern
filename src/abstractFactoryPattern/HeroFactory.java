package abstractFactoryPattern;

import abstractFactoryPattern.Hero;
import abstractFactoryPattern.Spirit;

public class HeroFactory extends SpiritFactory {

	@Override
	protected Spirit createSpirit() {
		// TODO Auto-generated method stub
		return new Hero(new HeroSkillPay());
	}

}
