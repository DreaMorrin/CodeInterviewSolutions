
public class LinkedListIntegerAddition {
	
	static class Node {
		Node next;
		int val;
		
		Node(int val) {
			this.val = val;
		}
	}
	
	static Node addition(Node a, Node b) {
		Node head = new Node(0);
		Node next = head;
		
		int carry = 0;
		while (true) {
			if (carry == 0 && a == null && b == null) {
				break;
			}
			
			if (a != null) {
				carry += a.val;
				a = a.next;
			}
			
			if (b != null) {
				carry += b.val;
				b = b.next;
			}
			
			next.next = new Node(carry % 10);
			next = next.next;
			carry /= 10;
		}
			
		return head.next;
	}

	public static void main(String[] args) {
		Node a = new Node(1);
		a.next = new Node(5);
		a.next.next = new Node(8);
		
		Node b = new Node(1);
		b.next = new Node(2);
		b.next.next = new Node(3);
		
		Node sum = addition(a, b);
		while (sum != null) {
			System.out.println(sum.val);	
			sum = sum.next;
		}
		
	}
}
