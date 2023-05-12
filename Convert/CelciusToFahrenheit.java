package Convert;

import java.util.*;

public class CelciusToFahrenheit implements ConvertTemp{
	private Scanner scanner = new Scanner(System.in);
	private double temp;
	private double fahrenheit;
	
	public CelciusToFahrenheit() {
		
	}
	public void enterTemp() {
		System.out.print("Enter The Temperature in Celcius: ");
		temp = scanner.nextDouble();
	}
	public void compute() {
		fahrenheit = (temp * 9/5) + 32;
		System.out.printf("fahrenheit: %2f \n", fahrenheit);
	}
}
