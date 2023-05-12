package villanueva_package_PracticalTestUnit6;

import javax.swing.*;

public class Villanueva_Practical_Test_Unit6_No4 {

	public static void main(String[] args) {
		String input =
		JOptionPane.showInputDialog("Input a Number: ");
		System.out.print("Input a Number: " + input);
		
		int num = Integer.parseInt(input);
		if (num > 0)
		{	
			System.out.print("\nPositive Number");
			JOptionPane.showMessageDialog(null, "Input: " + input + "\n" + "Positive Number");	
		}
		else if (num < 0)
		{
			System.out.print("\nNegative Number");
			JOptionPane.showMessageDialog(null, "Input: " + input + "\n" + "Negative Number");	
		}
		else
		{
			System.out.print("\nNumber is Zero");
			JOptionPane.showMessageDialog(null, "Input: " + input + "\n" + "Number is Zero");
		}
		
	}
}
