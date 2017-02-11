package simpleFactoryPattern;

/**
 * ==| Simple Factory Pattern 簡單靜態工廠模式 |==
 * 直接使用靜態方法(static method)來建立物件，
 * 缺點是沒辦法藉由繼承Factory來改變建立物件的行為。
 * 
 * @author coreyou
 *
 */
public class TestSimpleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiritSkill skill = new SpiritSkill(new SpiritFactory());
		skill.spiritJumpMove("Hero");
		skill.spiritJumpMove("Monster");
	}

}
