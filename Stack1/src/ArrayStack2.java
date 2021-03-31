import java.util.EmptyStackException;

public class ArrayStack2<E> {

	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		int top = 0;
		E[] s = null;
		return s[top];
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
