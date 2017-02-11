package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 樹狀結構中的節點
 * 
 * @author coreyou
 *
 */
public class Menu extends MenuComponent {
	// Menu可以有任意數量的子節點，子節點可以是另一個新的樹狀結構、也可以是葉節點，這裡使用ArrayList存取
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	
	public Menu(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return (MenuComponent)menuComponents.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	// 印出Menu中所有元件
	public void print() {
		System.out.println("\n" + getName() + " ");
		System.out.println("-----------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
		
	}
	
	// 加入iterator的功能
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new CompositeIterator(menuComponents.iterator());
	}
		
}
