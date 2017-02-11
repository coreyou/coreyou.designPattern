package compositePattern;

import java.util.Iterator;

/**
 * ==| Composite Pattern 合成模式 |==
 * 合成模式允許你將物件合成樹狀結構，呈現「部分/整體」的階層關係。
 * 合成能讓客戶程式碼以一致的方式處理個別物件，以及合成的物件。
 * 
 * 有些方法只對MenuItem有意義，有些只對Menu有意義，所以預設的實踐方式是丟出UnsupportedOperationException，
 * 如果MenuItem或Menu不支援某一個操作的時候，就不需要做任何事情
 * @author coreyou
 *
 */
public abstract class MenuComponent {
	
	// 以下三個方法是和Menu相關的：新增、移除`取得子節點
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	// 以下四個方法是和葉節點(MenuItem)相關的，但是有些也可以用在合成節點
	public String getName() {
		throw new UnsupportedOperationException();
	}	
	public int getAttackNumber() {
		throw new UnsupportedOperationException();
	}	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	// 加入反覆器(iterator)的功能
	public Iterator createIterator() {
		throw new UnsupportedOperationException();
	}
	
}
