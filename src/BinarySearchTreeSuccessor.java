/*
 * Question:
Given the root of a binary search tree and a value, find the "successor" of that value, even if the value doesn't exist in the tree. The "successor" is defined as the node appearing immediately after the given node when performing an in-order traversal.
 */
public class BinarySearchTreeSuccessor {
	
	class Node {
		Node p;
		Node left;
		Node right;
		int val;
	}
	
	static Node successor(Node n) {
		
		// look for it, if right sub tree is not empty
		if (n.right != null) {
			n = n.right;
			
			Node successor = n;
			// get left most leaf node
			while (n != null) {
				successor = n;
				n = n.left;
			}
			
			return successor;
		}
		
		return n.p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
