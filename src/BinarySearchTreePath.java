import java.util.List;

public class BinarySearchTreePath {
	
	static Node path(Node root, int a, int b, List<Integer> list) {
		if (root == null) {
			return null;
		}
		
		if (root.val == a || root.val == b) {
			list.add(root.val);
			return root;
		}
		
		Node left = path(root.left, a, b, list);
		Node right = path(root.right, a, b, list);
		
		if (left != null && right != null) {
			list.add(root.val);
			return null;
		}
		
		if (left != null) {
			list.add(root.val);
			return left;
		}
		
		if (right != null) {
			list.add(root.val);
			return right;
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
