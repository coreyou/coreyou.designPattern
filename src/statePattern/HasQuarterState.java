package statePattern;
/**
 * 有錢的狀態:
 * 投錢 > 回應已經投錢了
 * 退錢 > 糖果機進入NoQuarterState
 * 轉柄 > 糖果機進入SoldState
 * 發糖 > 回應要先轉柄
 * 
 * @author coreyou
 *
 */
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed, you need turn the crank");
	}

}
