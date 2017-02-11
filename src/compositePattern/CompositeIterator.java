package compositePattern;

import java.util.Iterator;
import java.util.Stack;
/**
 * 在合成(composite)中加入反覆器(iterator)成為合成反覆器(compositeIterator)
 * 負責反覆在元件中遊走。
 * 
 * @author coreyou
 *
 */
public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		// TODO Auto-generated constructor stub
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (stack.empty()) {
			return false;
		} else {
			// 取出堆疊最上層的反覆器
			Iterator iterator = (Iterator)stack.peek();
			// 如果堆疊最上層的反覆器中已經沒有下一個元素，則將這個反覆器拿出堆疊，再往下一個hasNext()看
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if (hasNext()) {
			// 如果還有下一個元素，就從堆疊中取出目前的反覆器(stack.peek)，並取出他的下一個元素(iterator.next())
			Iterator iterator = (Iterator)stack.peek();
			MenuComponent component = (MenuComponent)iterator.next();
			
			// 如果元素是一個菜單，等於是有了另一個合成節點，所以把它丟進堆疊中，需要進一步深入這個節點中
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			// 不管是否為菜單，都回傳此元素
			return component;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		// 不支援移除
		throw new UnsupportedOperationException();
	}

}
