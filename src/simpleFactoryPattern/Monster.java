package simpleFactoryPattern;

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
}
