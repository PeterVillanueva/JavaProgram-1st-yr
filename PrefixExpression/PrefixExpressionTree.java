package PrefixExpression;

import java.util.Stack;

class Node {
	char data;
	Node left;
	Node right;

	public Node(char data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class PrefixExpressionTree {
	Node root;

	public PrefixExpressionTree() {
		root = null;
	} // method to create a binary expression tree from a prefix expression

	public void constructTree(String prefix) {
		Stack<Node> stack = new Stack<>(); // iterate through the prefix expression in reverse order
		for (int i = prefix.length() - 1; i >= 0; i--) {
			char c = prefix.charAt(i);
			if (Character.isDigit(c)) { 
										// if the character is a digit, create a new node with the digit and push it onto the stack
				stack.push(new Node(c));
			} else { // if the character is an operator, pop the top two nodes off the stack and
						// create a new node with the operator
				// set the popped nodes as the left and right children of the new node, and push
				// the new node back onto the stack
				Node left = stack.pop();
				Node right = stack.pop();
				Node operator = new Node(c);
				operator.left = left;
				operator.right = right;
				stack.push(operator);
			}
		}
		root = stack.pop(); // the last node left on the stack is the root of the binary expression tree
	} // method to print the binary expression tree in infix form

	public void printInfix(Node node) {
		if (node == null)
			return;
		printInfix(node.left);
		System.out.print(node.data + " ");
		printInfix(node.right);
	}

	public static void main(String[] args) {
		PrefixExpressionTree tree = new PrefixExpressionTree();
		String prefix = "+*23-9/61"; // construct the binary expression tree from the prefix expression
		tree.constructTree(prefix);
		System.out.print("Infix form output: ");
		tree.printInfix(tree.root);
	}
}
