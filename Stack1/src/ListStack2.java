
public class ListStack2 {

	public E peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return top.getItem();
	}

	public E pop() {
		if (isEmpty())
			throw new EmptyStackException();
		E topItem = top.getItem();
		top = top.getNext();
		size--;
		return topItem;
	}

	public void print() {
		if (isEmpty())
			System.out.println("스택이 비어있음.");
		else
			for (Node p = top; p != null; p = p.getNext())
				System.out.println(p.getItem() + "\t ");
		System.out.println();
	}


	public static void main(String[] args) {
		ListStack<String> stack = new ListStack<String>();
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
	}
}
