package control_structures;

import javax.swing.JOptionPane;

public class Switch_Statement {

	public static void main(String[] args) {

		int menuChoice = 0;

		Integer.parseInt(JOptionPane.showInputDialog(null, "Your Menu Choice"));
		switch (menuChoice) {
		case 1:
			JOptionPane.showMessageDialog(null, "You chose number 1.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You chose number 2.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "You chose number 3.");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "You chose number 4.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Something went wrong!");
			break;
		}
	}

}
