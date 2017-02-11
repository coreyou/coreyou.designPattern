package abstractFactoryPattern;

public class HeroSkillPay implements SkillPay {

	@Override
	public int createHpPay() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int createMpPay() {
		// TODO Auto-generated method stub
		return 77;
	}

}
