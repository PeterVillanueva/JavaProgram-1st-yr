package villanueva_package_PracticalTestUnit6;

import javax.swing.JOptionPane;

public class Villanueva_Practical_Test_Unit6_No6 {

	public static void main(String[] args) {
		
		int num = 0;

		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a Number: "));
		int day = num;
		
		switch (day)
		{
		case 1:	JOptionPane.showMessageDialog(null, "Monday");
		break;
		case 2:JOptionPane.showMessageDialog(null, "Tuesday");
		break;
		case 3:JOptionPane.showMessageDialog(null, "Wednesday");
		break;
		case 4:JOptionPane.showMessageDialog(null, "Thursday");
		break;
		case 5:JOptionPane.showMessageDialog(null, "Friday");
		break;
		case 6:JOptionPane.showMessageDialog(null, "Saturday");
		break;
		case 7:JOptionPane.showMessageDialog(null, "Sunday");
		break;
		default:JOptionPane.showMessageDialog(null, "Invalid Input");
		break;
		}

	}
}
