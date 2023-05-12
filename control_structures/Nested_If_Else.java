package control_structures;

import javax.swing.JOptionPane;

public class Nested_If_Else {

	public static void main(String[] args) {

		int side1 =

				Integer.parseInt(JOptionPane.showInputDialog("Enter the first side"));

		int side2 =

				Integer.parseInt(JOptionPane.showInputDialog("Enter the second side"));

		int side3 =

				Integer.parseInt(JOptionPane.showInputDialog("Enter the third side"));

		if (side1 == side2 && side2 == side3) {
			JOptionPane.showMessageDialog(null, "It is an equilateral triangle");
		} else {
			if (side1 == side2 || side2 == side3) {
				JOptionPane.showMessageDialog(null, "It is an isosceles triangle");

			} else {

				JOptionPane.showMessageDialog(null, "It is a scalene triangle");
			}
		}
	}
}
