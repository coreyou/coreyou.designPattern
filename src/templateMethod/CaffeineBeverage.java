package templateMethod;
/**
 * ==| Template Method Pattern 樣板方法模式 |==
 * 將一個演算法的骨架定義在一個方法中，而演算法本身會用到的一些方法，則是定義在次類別中。
 * 樣板方法讓次類別在不改變演算法架構的情況下，重新定義演算法中的某些步驟。
 * 
 * 設計守則: 好來塢守則，別呼叫我們，我們會呼叫你。低階元件不要去呼叫高階元件，由高階元件決定什麼時候要呼叫低階元件。
 * 在此例中的高階元件是CaffeineBeverage，低階元件是Coffee和Tea 
 * 
 * @author coreyou
 *
 */
public abstract class CaffeineBeverage {
	
	// *樣板方法: 定義了演算法的步驟
	final void prepareRecipe() {
		boilWater();
		brew();	// 抽象方法
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	// hook，掛勾: 讓使用者自己去決定是否要推翻，若不在次類別推翻，則使用在這裡所定義的預設
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}

	// 咖啡和茶的處理方式不一樣，所以留到次類別再定義，在這裡定義成抽象
	abstract void brew();
	abstract void addCondiments();
	
	// 咖啡和茶的處理方式一樣，在這裡直接定義
	final void boilWater() {
		System.out.println("Boiling water");
	}	
	final void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
