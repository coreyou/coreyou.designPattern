package decoratorPattern;

/**
 * ==| Decorator Pattern 裝飾者模式 |== 
 * Java I/O 的類別例如InputStream等都是利用裝飾者模式的概念。
 * 
 * 設計守則1: 找出程式中可能需要更動之處，把他們獨立出來，不要和那些不需要更動的程式碼混在一起。
 * 設計守則2: 寫程式是針對介面而寫，而不是針對實踐方式而寫。
 * 設計守則3: 多用合成，少用繼承。(implements > extends)
 * 設計守則4: 類別應該開放以便擴充，應該關閉以禁止修改。
 * 
 * @author coreyou
 *
 */
public class TestCoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}

}
