package factoryMethodPattern;
/**
 * ==| Factory Method Pattern 工廠方法模式 |==
 * 定義了一個建立物件的介面: abstract Spirit createSpirit(String type);
 * 但由次類別決定要實體化的類別為何者。
 * 
 * 設計守則: 依賴抽象類別，不要依賴具象類別。也叫做「顛覆相依守則(dependency Inversion Principle)」。
 * 遵守以下原則可以避免違反顛覆相依守則:
 * 1. 變數不可以持有具象類別的參考。要使用new的話，就改使用工廠。
 * 2. 不要讓類別繼承自具象類別。如果繼承具象類別就會依賴具象類別，請繼承自抽象(介面或抽象類別)。
 * 3. 不要讓次類別中的方法override超類別中的方法。超類別中所實踐的方法應該由所有次類別共享，如果推翻了的話，表示這個超類別不是一個真的適合被繼承的抽象類別。
 * 如果要違反上述原則，應該要有相當的理由。比如我們平常也一直在實體化字串類別，但因為字串類別不會改變所以沒問題。
 * 
 * @author coreyou
 *
 */
public abstract class SpiritSkill {
	
	public Spirit spiritJumpMove(String type) {
		Spirit spirit = createSpirit(type);

		spirit.performJump();
		spirit.performMove();
		
		return spirit;
	}
	// 把工廠物件改為工廠方法
	abstract Spirit createSpirit(String type);
}
