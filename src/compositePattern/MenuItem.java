package compositePattern;

import java.util.Iterator;

/**
 * 葉節點(leaf)
 * 
 * @author coreyou
 *
 */
public class MenuItem extends MenuComponent {
	String name;
	int attackNumber;
	double price;
	
	public MenuItem(String name, int attackNumber, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.attackNumber = attackNumber;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAttackNumber() {
		return attackNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.print(getName() + " ");
		System.out.print(getAttackNumber() + " ");
		System.out.println(getPrice());
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
}
