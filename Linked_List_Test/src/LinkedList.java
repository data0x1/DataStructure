public class LinkedList {
	public static void main(String args[]) {
		LinkedList L = new LinkedList();
		System.out.println("(1) ���� ����Ʈ�� ��� 3�� �����ϱ�");
		L.insertLastNode("��");
		L.insertLastNode("��");
		L.insertLastNode("��");
		L.printList();
		System.out.println("(2) �� ��� �ڿ� �� ��� �����ϱ�");
		ListNode pre = L.searchNode("��");
		if (pre == null)
			System.out.println("�˻�����>> ã�� �����Ͱ� �����ϴ�.");
		else {
			L.insertMiddleNode(pre, "��");
			L.printList();
		}
		System.out.println("(3) ����Ʈ�� ��带 �������� �ٲٱ�");
		L.reverseList();
		L.printList();
		System.out.println("(4) ����Ʈ�� ������ ��� �����ϱ�");
		L.deleteLastNode();
		L.printList();
	}

	private void deleteLastNode() {
		// TODO Auto-generated method stub
		
	}

	private void reverseList() {
		// TODO Auto-generated method stub
		
	}

	private ListNode searchNode(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void printList() {
		// TODO Auto-generated method stub
		
	}

	public void insertLastNode(String string) {
		// TODO Auto-generated method stub
		
	}
}