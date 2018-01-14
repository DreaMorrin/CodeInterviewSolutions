/*
 * Question:
Given the root of a binary search tree and a value, find the "successor" of that value, even if the value doesn't exist in the tree. The "successor" is defined as the node appearing immediately after the given node when performing an in-order traversal.
 */
public class BinarySearchTreeSuccessor {
	
	static Node successor(Node root, Node target) {
		
		Node parent = null;
		while (root != null) {
			
			// find target node
			if (target.val == root.val) {
				
				// look for it, if right sub tree is not empty
				if (target.right != null) {
					Node successor = target;
					
					// get left most leaf node
					while (target != null) {
						successor = target;
						target = target.left;	
					}
					
					return successor;
				}
				// if there is no right subtree for target node, the successor is parent node
				else {
					return parent;
				}
			}
			
			// binary search
			else if (target.val < root.val) {
				parent = root;
				root = root.left;
			}
			else if (target.val > root.val) {
				parent = root;
				root = root.right;
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
