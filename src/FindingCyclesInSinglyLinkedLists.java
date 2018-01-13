
public class FindingCyclesInSinglyLinkedLists {

	class Node {
		Node next;
		int val;
		
		Node(int val) {
			this.val = val;
		}
	}
	
	static boolean hasCycles(Node root) {
		Node faster = root;
		Node slower = root;
		
		while (faster != null && faster.next != null) {
			if (faster == slower) {
				return true;
			}
			
			faster = faster.next.next;
			slower = slower.next;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
