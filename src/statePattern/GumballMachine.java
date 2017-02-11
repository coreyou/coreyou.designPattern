package statePattern;
/**
 * ==| State Pattern 狀態模式 |==
 * 允許物件隨著內在狀態改變而改變行為，好像物件的類別改變了一樣。
 * 基本上類別圖畫起來會和策略模式一樣，但是目的和策略模式不一樣，
 * 狀態模式會預先規劃好什麼時候要改變狀態，而策略模式並沒有定義一組狀態轉變的方式。
 * 
 * @author coreyou
 *
 */
public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;	// 起始狀態: 沒裝糖果
	int count = 0; // 機器中的糖果數
	
	public GumballMachine(int numberGumballs) {
		// TODO Auto-generated constructor stub
		// 建立每一個狀態的實體
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;	// 狀態: 沒給25分錢
		}
	}
	
	/*
	 * 以下動作都會轉介到狀態去完成
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count--;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}
	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}
	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return hasQuarterState;
	}
	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}
}
