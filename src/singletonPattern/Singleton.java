package singletonPattern;
/**
 * ==| Singleton Pattern 獨體模式 |==
 * 確保一個類別只有一個實體，並給予一個存取的全域點(global point, 在此例為getInstance())，
 * 在這裡使用雙重檢查上鎖(double-checked locking)，先檢查實體是否已經建立了，此例中也就是uniqueInstance，
 * 如果尚未建立，才進行同步化，避免使用同步化:public static synchronized Singleton getInstance()而拖垮效能。
 * 
 * @author coreyou
 *
 */
public class Singleton {
	private volatile static Singleton uniqueInstance;	// volatile為輕量化的synchronized。
	
	private Singleton(){}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {	// 雙重檢查上鎖的第一道鎖
			synchronized (Singleton.class){	// 第二道鎖
				if (uniqueInstance == null) {	//如果沒建過實體才去建，這叫做"拖延實體化"
					uniqueInstance = new Singleton();	
				}				
			}			
		}
		return uniqueInstance;
	}
}
