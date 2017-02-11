package adapterPattern;
/**
 * ==| Adapter Pattern 轉接器模式 |==
 * 改變介面以符合客戶的期望。
 * 這裡是把火雞轉成鴨子。
 * 
 * @author coreyou
 *
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		// TODO Auto-generated constructor stub
		this.turkey = turkey;
	}
	
	// 火雞沒有quack()，這裡直接呼叫火雞的gobble()以達成類別之間的轉變。
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();
	}

}
