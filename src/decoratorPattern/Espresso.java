package decoratorPattern;

public class Espresso extends Beverage {
	
	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "Espresso";
	}
	
	public double cost() {
		return 1.99;
	}

}
