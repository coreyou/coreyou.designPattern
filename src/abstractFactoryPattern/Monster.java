package abstractFactoryPattern;

public class Monster extends Spirit {
	public void performJump() {
		System.out.println("monster is jumping");
	}

	public void performMove() {
		System.out.println("monster is moving");
	}
	
	public void performSpeaking() {
		System.out.println("roaring...");
	}

	@Override
	void fireballSpell() {
		// TODO Auto-generated method stub
		System.out.println("monster fireball spell");
	}
}
