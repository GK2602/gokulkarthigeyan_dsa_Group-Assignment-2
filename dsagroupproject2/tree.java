package dsagroupproject2;

class Node {
	int d;
	Node left;
	Node right;

	Node(int data) {
		d = data;
		left = null;
		right = null;
	}
}

public class tree {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void binarytoskewed(Node root, int order) {

		if (root == null) {
			return;
		}

		if (order > 0) {
			binarytoskewed(root.right, order);
		} else {
			binarytoskewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			binarytoskewed(leftNode, order);
		} else {
			binarytoskewed(rightNode, order);
		}
	}

	static void RightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.d + " ");
		RightSkewed(root.right);
	}

}
