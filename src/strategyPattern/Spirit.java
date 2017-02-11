package strategyPattern;
/**
 * ==| Strategy Pattern 策略模式 |== 
 * 把會變動的部分獨立出來: JumpBehavior, MoveBehavior，設定為Interface，
 * 實作獨立出來的Interface: JumpByHero, JumpTwiceHeight，
 * 在執行期間才去指定使用的是哪一個實作的class，如果Spirit heroSam = new Hero("Sam");
 * 由於Hero繼承了Spirit，表示接下來Spirit.performJump()裡面的jumpBehavior.jump();，
 * 其jumpBehavior將會是在Hero裡面所指定的，所做出來的行為就會是Hero的行為。
 * 策略模式定義了一組可替換的演算法。
 * 
 * 設計守則1: 找出程式中可能需要更動之處，把他們獨立出來，不要和那些不需要更動的程式碼混在一起。
 * 設計守則2: 寫程式是針對介面而寫，而不是針對實踐方式而寫。
 * 設計守則3: 多用合成，少用繼承。(implements > extends)
 * @author coreyou
 *
 */
public abstract class Spirit {
	protected JumpBehavior jumpBehavior;
	protected MoveBehavior moveBehavior; 
	
	public Spirit() {
		System.out.println("Spirit created(" + this.getClass().getName().toString() + ")");
	}
	
	public void performJump() {
		jumpBehavior.jump();
	}
	public void performMove() {
		moveBehavior.move();
	}
	public void showStatus() {
		System.out.println("this is --" + this.getClass().getName().toString() + "-- object");
	}
	public void setJumpBehavior(JumpBehavior jb) {
		jumpBehavior = jb;
		System.out.println("setting jumpBehavior to " + jb.getClass().getName().toString());
	}
	public void setMoveBehavior(MoveBehavior mb) {
		moveBehavior = mb;
		System.out.println("setting moveBehavior to " + mb.getClass().getName().toString());
	}
	
}
