package PracticalExercise;

class TreeNode{
	int val;
	TreeNode left, right;
	
	TreeNode(int x) {
		val = x;
	}
}

public class BinaryTreeSum {
	
	public static int sumBinaryTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		// Traverse left subtree
		int left = sumBinaryTree(root.left);
		// Traverse right subtree
		int right = sumBinaryTree(root.right);
		// Add current node value to the sum of left and right subtree
		int total = left + right + root.val;
		return total;
	}

	public static void main(String[] args) {
		// Construct Binary Tree
		TreeNode root = new TreeNode(95);
		
		root.left = new TreeNode(90);
		root.right = new TreeNode(97);
		root.right.right = new TreeNode(85);
		
		// Print the BinaryTee
		
		System.out.println("Binary Tree: " + root.val + " " + root.left.val + " " + root.right.val + " " +
		root.right.right.val);
		
		// Print the Sum and Average
		
		int sum = sumBinaryTree(root);
		System.out.println("Sum of 4 Numbers: " + sum);
		
		double average = sum / 4.0 ;
		System.out.println("Average of 4 Numbers: " + average);

	}

}
