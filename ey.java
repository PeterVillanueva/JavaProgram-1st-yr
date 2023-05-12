
import javax.swing.JOptionPane;

import java.lang.Math;

class Villanueva {
    public static void main(String[] args) {
    	
    	double num = 0;
    	double num1 = 0;
    	double surfaceArea;
    	
    	JOptionPane.showMessageDialog(null, "Hello User Please Input a Number");
        num = Double.parseDouble(JOptionPane.showInputDialog ("Enter the radius of the cylinder: "));
        num1 = Double.parseDouble (JOptionPane.showInputDialog ("Enter the height of the cylinder: "));
        surfaceArea = 2 * Math.PI * num * num1 + 2 * Math.PI * Math.pow(num, 2);
        JOptionPane.showMessageDialog(null, "The surface area of the cylinder is: " + surfaceArea);
        
        
        System.exit(0);
    }
    
}