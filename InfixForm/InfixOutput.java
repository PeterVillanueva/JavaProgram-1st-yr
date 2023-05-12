package InfixForm;

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
public class InfixOutput {
    Node root;
    public InfixOutput() {
        root = null;
    }
    // method to print the binary tree in infix form
    public void printInfix(Node node) {
        if (node == null)
            return;
        printInfix(node.left);
        System.out.print(node.data + " ");
        printInfix(node.right);
    }
    public static void main(String[] args) {
        InfixOutput tree = new InfixOutput();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.print("Infix form output: ");
        tree.printInfix(tree.root);
    }
}