package villanuevapackage;

import javax.swing.JOptionPane;

public class JOptionpane_activity1 {

	public static void main(String[] args) {
		int num=0;   int num1=0; 
		 
		num = Integer.parseInt (JOptionPane.showInputDialog ("Enter 1st number: "));
		num1 = Integer.parseInt (JOptionPane.showInputDialog ("Enter 2nd number: ")); 
		int sum = num + num1; 
		 
		JOptionPane.showMessageDialog(null,"Sum of two numbers: " + sum,"Summation", JOptionPane.INFORMATION_MESSAGE);  
		
		 
	}
}
