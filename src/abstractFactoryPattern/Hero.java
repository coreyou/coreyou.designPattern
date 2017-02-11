package abstractFactoryPattern;

public class Hero extends Spirit {
	SkillPay skillPay;
	
	public Hero(SkillPay skillPay) {
		this.skillPay = skillPay;
	}
	
	public void performJump() {
		System.out.println("hero is jumping");
	}

	public void performMove() {
		System.out.println("hero is moving");
	}

	@Override
	void fireballSpell() {
		// TODO Auto-generated method stub
		System.out.println("hero fireball spell");
		hpUsed = skillPay.createHpPay();
		mpUsed = skillPay.createMpPay();
		System.out.println("-hp:" + hpUsed + " -mp:" + mpUsed);
	}
	
}
