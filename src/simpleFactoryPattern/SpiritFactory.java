package simpleFactoryPattern;
/**
 * 直接使用靜態方法(static method)來建立物件
 * 
 * @author coreyou
 *
 */
public class SpiritFactory {
	public static Spirit createSpirit(String type) {
		// new物件的部分
		Spirit spirit = null;
		if  (type.equalsIgnoreCase("Hero")) {
			spirit = new Hero(); 
		} else if (type.equalsIgnoreCase("Monster")) {
			spirit = new Monster();
		}			
		
		return spirit;
	}
}
