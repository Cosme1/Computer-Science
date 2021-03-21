import java.util.LinkedList;

public class Stack {
	private LinkedList list;
	private Object item;

	public Stack() {
		list = new LinkedList();
	}

	public boolean isEmpty(){
		return (list.size() == 0);
	}

	public void push(Object item) {
		list.add(item);
	}

	public Object pop() {

		Object top = list.getLast();
		list.removeLast();
		return top;
	}
}
