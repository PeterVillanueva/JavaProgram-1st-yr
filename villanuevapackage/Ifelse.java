package villanuevapackage;

import javax.swing.JOptionPane;

public class Ifelse {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter your age");
		
		int age = Integer.parseInt(input);
		
		if (age >= 18) {
			JOptionPane.showMessageDialog(null, "You are an adult");
		
		}
		else JOptionPane.showMessageDialog(null, "You are young");
	}

}
