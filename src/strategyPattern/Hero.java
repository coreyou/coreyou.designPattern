package strategyPattern;

public class Hero extends Spirit {
	protected String name;
	public Hero() {
		jumpBehavior = new JumpByHero();
		moveBehavior = new MoveByHero(); 
	}
	public Hero(String name) {
		this.name = name;
		jumpBehavior = new JumpByHero();
		moveBehavior = new MoveByHero(); 
	}
	public void showStatus() {
		System.out.println("hero's name is --" + this.name + "--");
	}
}
