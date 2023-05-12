package villanueva_package_PracticalTestUnit6;

import javax.swing.*;

public class Villanueva_Practical_Test_Unit6_No5 {

	public static void main(String[] args) {
		
		String input =
				JOptionPane.showInputDialog("Input the number");
		System.out.print("Number of Terms: " + input);
		System.out.print("\n");
	
		int num = Integer.parseInt(input);
		for(int i = 1; i <=num;i++)
		{
			System.out.printf("%d x %d = %d \n", num, i, num * i);
		}
	}
}
