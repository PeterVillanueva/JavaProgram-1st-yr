package GUI;

import java.awt.*;
import javax.swing.*;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
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
        if (node == null) {
            return 0;
        } else {
            return node.key + calculateSum(node.left) + calculateSum(node.right);
        }
    }
}

class TreePanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int diameter = 30;
    private int hGap = 50;
    private int vGap = 80;

    private BinaryTree tree;

    public TreePanel(BinaryTree tree) {
        this.tree = tree;
        setBackground(new Color(255, 218, 185)); // set background to peach
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3)); // set stroke to bold
        g2d.setFont(new Font("Arial", Font.BOLD, 16)); // set font to bold and increase size

        if (tree.root != null) {
            int x = getWidth() / 2;
            int y = vGap;
            drawNode(g2d, tree.root, x, y, hGap);
        }
    }

    private void drawNode(Graphics2D g, Node node, int x, int y, int hGap) {
        g.setColor(Color.BLACK);
        g.drawOval(x - diameter / 2, y - diameter / 2, diameter, diameter);
        g.setColor(Color.WHITE);
        g.fillOval(x - diameter / 2, y - diameter / 2, diameter, diameter);
        g.setColor(Color.BLACK);
        g.drawString(Integer.toString(node.key), x - 6, y + 6);
        

        if (node.left != null) {
            int xLeft = x - hGap;
            int yLeft = y + vGap;
            g.drawLine(x, y, xLeft, yLeft);
            drawNode(g, node.left, xLeft, yLeft, hGap / 2);
        }

        if (node.right != null) {
            int xRight = x + hGap;
            int yRight = y + vGap;
            g.drawLine(x, y, xRight, yRight);
            drawNode(g, node.right, xRight, yRight, hGap / 2);
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }
}

public class BinaryTreeGUI extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BinaryTree tree;

    public BinaryTreeGUI() {
        tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(9);
        tree.root.right.right = new Node(11);

        TreePanel panel = new TreePanel(tree);
        getContentPane().add(panel);

        setTitle("Binary Tree");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
		BinaryTreeGUI gui = new BinaryTreeGUI();
    }
}
