package statePattern;

public class TestGumballMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println("gumball: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println("gumball: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		System.out.println("gumball: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		System.out.println("gumball: " + gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println("gumball: " + gumballMachine.getCount());
	}

}
