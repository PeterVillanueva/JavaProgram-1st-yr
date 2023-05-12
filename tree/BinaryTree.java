package tree;

// class to create nodes
class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

//class for binary tree
class BinaryTree {
	Node root;

	// Traverse tree
	public void traverseTree(Node node) {
		if (node != null) {
			traverseTree(node.left);
			System.out.print(" " + node.key);
			traverseTree(node.right);
		}
	}

	public static void main(String[] args) {

		// create an object of BinaryTree
		BinaryTree tree = new BinaryTree();

		// create nodes of the tree
		tree.root = new Node(2);
		tree.root.left = new Node(4);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(8);

		System.out.print("Binary Tree: ");
		tree.traverseTree(tree.root);
	}
}
