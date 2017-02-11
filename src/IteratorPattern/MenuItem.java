package IteratorPattern;

public class MenuItem {
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
}
