package IteratorPattern;

import java.util.Iterator;

public class SkillIterator implements Iterator<Object> {
	MenuItem[] items;
	int position = 0;
	
	public SkillIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public Object next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}
	
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if (position <= 0) {
			throw new IllegalStateException("You can't remove an item until you've done at least one next()");
		}
		// 將被刪除的物件之後的每一個物件，都往前移動一個位置。
		if (items[position-1] != null) {
			for (int i = position-1; i < (items.length-1); i++) {
				items[i] = items[i+1];
			}
			//
			items[items.length-1] = null;
		}
	}
}
