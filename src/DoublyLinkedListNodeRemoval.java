/*
 * Question:
Given a doubly linked list and an integer, write a function that removes the first occurrence of that integer from the list.
 */
public class DoublyLinkedListNodeRemoval {
	
	class Node {
		public int value;
		public Node prev;
		public Node next;
	}
	
	static public void removal(Node root, int v) {
		
		while (root != null) {
			if (root.value == v) {
				root.prev.next = root.next;
				
				if (root.next != null) {
					root.next.prev = root.prev;
				}
				
				return;
			}
			
			root = root.next;
		}
	}

	public static void main(String[] args) {
		
	}

}
