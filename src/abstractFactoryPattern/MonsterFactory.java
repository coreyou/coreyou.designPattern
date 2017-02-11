package abstractFactoryPattern;

import abstractFactoryPattern.Monster;
import abstractFactoryPattern.Spirit;

public class MonsterFactory extends SpiritFactory {

	@Override
	protected Spirit createSpirit() {
		// TODO Auto-generated method stub
		return new Monster();
	}

}
