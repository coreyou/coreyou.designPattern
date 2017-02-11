package abstractFactoryPattern;
/**
 * @author coreyou
 *
 */
public abstract class Spirit {
	String name;
	int hpUsed;
	int mpUsed;
	
	abstract void fireballSpell();
	
	public Spirit() {
		System.out.println("Spirit created(" + this.getClass().getName().toString() + ")");
	}
	
	public void performJump() {
		System.out.println("spirit is jumping");
	}

	public void performMove() {
		System.out.println("spirit is moving");
	}
	
	public void performSpeaking() {
		System.out.println("");
	}
	
	public String getName() {
		return name;
	}
}
