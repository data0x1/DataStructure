
public class ListStack<E> {
	private Node<E> top;
	private int size;

	public ListStack() {
		top = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(E newItem) {
		Node newNode = new Node(newItem, top);
		top = newNode;
		size++;
	}

}