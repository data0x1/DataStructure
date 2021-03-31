import java.util.EmptyStackException;

public class ArrayStack4<E> {

	public E pop() {
		if (isEmpty()) throw new EmptyStackException();
		E[] s = null;
		int top = 0;
		E item = s[top];
		s[top--] = null;
		if (size() > 0 && size()==s.length/4)
			resize(s.length/2);
		return item;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	private void resize(int i) {
		// TODO Auto-generated method stub
		
	}

	private int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
