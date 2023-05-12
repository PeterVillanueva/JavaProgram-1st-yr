package TraverseTree;
class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}
class BinaryTree {
    Node root;
    void traverseTree(Node root) {
        if (root == null) {
            return;
        }
        // Perform some operation on the current node
        System.out.print(root.val + " ");
        traverseTree(root.left);
        traverseTree(root.right);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.print("Traversal order: ");
        tree.traverseTree(tree.root); // Output: 1 2 4 5 3
    }
}
