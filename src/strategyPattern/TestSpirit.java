package strategyPattern;

public class TestSpirit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spirit heroSam = new Hero("Sam");
		heroSam.performJump();
		heroSam.performMove();
		heroSam.setJumpBehavior(new JumpTwiceHeight());
		heroSam.performJump();
		heroSam.showStatus();
	}

}
