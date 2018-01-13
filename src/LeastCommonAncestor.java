/*
 * Question:
Given the root of a binary search tree and two values, find the least common ancestor of the two values.

 */

public class LeastCommonAncestor {
	
	class Node {
		Node left;
		Node right;
		int val;
	}
	
	static Node genericApproach(Node root, int a, int b) {
		if (root == null) {
			return null;
		}
		
		if (root.val == a || root.val == b) {
			return root;
		}
		
		Node left = genericApproach(root.left, a, b);
		Node right = genericApproach(root.right, a, b);
		
		if (left != null && right != null) {
			return root;
		}
		
		if (left != null) {
			return left;
		}
		
		if (right != null) {
			return right;
		}
		
		return null;
	}
	
	static Node binarySearchApproach(Node root, int a, int b) {
		
		if (root == null) {
			return null;
		}
		
		if (root.val == a || root.val == b) {
			return root;
		}
		
		if ((a < root.val && b > root.val) || (a > root.val && b < root.val)) {
			return root;
		}
		
		if (a < root.val && b < root.val) {
			return binarySearchApproach(root.left, a, b);
		}
		
		if (a > root.val && b > root.val) {
			return binarySearchApproach(root.right, a, b);
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
