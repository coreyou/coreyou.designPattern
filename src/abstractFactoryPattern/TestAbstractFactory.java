package abstractFactoryPattern;

/**
 * ==| Abstract Factory Pattern 抽象工廠模式 |==
 * 需要一組可以隨時抽換的元件，並且希望可以簡單地 一次抽換
 * 
 * @author coreyou
 *
 */
public class TestAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 隨時可以在英雄和怪物之間替換
		 */
		SpiritSkill skill = new SpiritSkill(new HeroFactory());
		//SpiritSkill skill = new SpiritSkill(new MonsterFactory());
		skill.spiritFireball();
	
	}

}
