package tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class FabayBinaryTree {
    public static int sumBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Traverse left subtree
        int leftSum = sumBinaryTree(root.left);
        // Traverse right subtree
        int rightSum = sumBinaryTree(root.right);
        // Add current node value to sum of left and right subtrees
        int totalSum = leftSum + rightSum + root.val;
        return totalSum;
    }

    public static void main(String[] args) {
        // Construct binary tree
        TreeNode root = new TreeNode(95);
        root.left = new TreeNode(90);
        root.right = new TreeNode(97);
        root.right.right = new TreeNode(85);

        // Get sum of the binary tree
        int treeSum = sumBinaryTree(root);
        System.out.println("The sum of four numbers: " + treeSum);
       
        // Compute average of four numbers
        double average = treeSum / 4.0;
        System.out.println("Average of four numbers: " + average);
      
    }
}
