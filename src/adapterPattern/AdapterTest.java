package adapterPattern;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says...");
		testDuck(duck);
		
		System.out.println("\nThe adapter says...");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
