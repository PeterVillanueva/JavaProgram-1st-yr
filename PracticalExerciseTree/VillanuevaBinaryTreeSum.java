package PracticalExerciseTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class VillanuevaBinaryTreeSum {

    public static int sumBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Traverse left subtree
        int leftSum = sumBinaryTree(root.left);
        // Traverse right subtree
        int rightSum = sumBinaryTree(root.right);
        // Add current node value to sum of left and right subtree
        int totalSum = leftSum + rightSum + root.val;
        return totalSum;
    }


    public static void main(String[] args) {
        // Construct Binary Tree
        TreeNode root = new TreeNode(95);

        root.left = new TreeNode(90);
        root.right = new TreeNode(97);
        root.right.right = new TreeNode(85);
        
        
        System.out.println("BinaryTree: " + root.val + " " + root.left.val + " " + root.right.val + " " + root.right.right.val);

        int sum = sumBinaryTree(root);
        System.out.println("Sum of 4 Numbers: " + sum);
        
        double average = sum / 4.0;
        System.out.println("Average of 4 Numbers: " + average);
        
    }

}
