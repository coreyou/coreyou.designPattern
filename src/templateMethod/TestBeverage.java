package templateMethod;

public class TestBeverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		
		System.out.println("===Tea===");
		tea.prepareRecipe();
		System.out.println("\n==Coffee==");
		coffee.prepareRecipe();
	}

}
