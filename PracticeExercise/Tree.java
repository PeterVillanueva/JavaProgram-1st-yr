package PracticeExercise;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class Tree {
	Node root;

	public void traverseTree(Node node) {
		if (node != null) {
			traverseTree(node.left);
			System.out.print(" " + node.key);
			traverseTree(node.right);
		}
	}

	// To calculate the sum of all of our Nodes
	public int calculateSum(Node node) {

		// Using if-else statement
		if (node == null) {
			return 0;
		} else {
			return node.key + calculateSum(node.left) + calculateSum(node.right);
		}
	}

	public static void main(String[] args) {

		Tree tree = new Tree();

		tree.root = new Node(1); // Our root Node
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.right.left = new Node(9);
		tree.root.right.right = new Node(11);

		System.out.print("Binary Tree: ");
		tree.traverseTree(tree.root);

		int sum = tree.calculateSum(tree.root);
		System.out.println("\nSum of nodes in the binary tree: " + sum); // print the sum

	}

}
