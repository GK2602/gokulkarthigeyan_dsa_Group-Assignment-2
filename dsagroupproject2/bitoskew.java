package dsagroupproject2;

public class bitoskew extends tree {

	public static void main(String[] args) {

		tree demo = new tree();
		demo.node = new Node(50);
		demo.node.left = new Node(30);
		demo.node.left.left = new Node(10);
		demo.node.right = new Node(60);
		demo.node.right.left = new Node(55);

		int order = 0;
		binarytoskewed(node, order);
		RightSkewed(headNode);
	}
}
