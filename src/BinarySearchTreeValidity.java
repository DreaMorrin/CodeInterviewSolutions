/*
 * Question:
Given the pointer to a node, determine if the node is the root of a binary search tree. We can assume the integers in the tree are distinct i.e. there are no repeating numbers.
 */
public class BinarySearchTreeValidity {
	
	class Node {
		Node left;
		Node right;
		int val;
	}
	
	static boolean isValidBST(Node root) {
		if (root == null) {
			return true;
		}
		
		if (root.left != null && root.left.val > root.val) {
			return false;
		}
		
		if (root.right != null && root.right.val < root.val) {
			return false;
		}
		
		return isValidBST(root.left) && isValidBST(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
