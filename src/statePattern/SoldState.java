package statePattern;
/**
 * 賣出的狀態:
 * 投錢 > 回應請等待給糖
 * 退錢 > 回應請等待給糖
 * 轉柄 > 回應請等待給糖
 * 發糖 > 糖果機發糖果，如果發完糖後糖果數不為零，糖果機進入NoQuarterState，否則則進入SoldOutState
 * 
 * @author coreyou
 *
 */
public class SoldState implements State {
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, you already turned the crank");		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning twice doesn't get you another gumball!");		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {	// 沒處理退錢
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		
	}

}
