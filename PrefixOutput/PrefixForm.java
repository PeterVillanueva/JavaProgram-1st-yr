package PrefixOutput;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class PrefixForm {
	Node root;

	public PrefixForm() {
		root = null;
	}

	// method to print the binary tree in prefix form
	public void printPrefix(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		printPrefix(node.left);
		printPrefix(node.right);
	}

	public static void main(String[] args) {
		PrefixForm tree = new PrefixForm();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.print("Prefix form output: ");
		tree.printPrefix(tree.root);
	}
}
