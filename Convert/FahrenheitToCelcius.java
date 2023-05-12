package Convert;

import java.util.*;

public class FahrenheitToCelcius implements ConvertTemp{
	private Scanner scanner = new Scanner(System.in);
	private double temp;
	private double celcius;
	
	public FahrenheitToCelcius() {
		
	}
	public void enterTemp() {
		System.out.print("Enter The Temperature in Fahrenheit: ");
		temp = scanner.nextDouble();
	}
	public void compute() {
		celcius = (temp - 32) * .5556;
		System.out.printf("Celcius: %2f \n", celcius);
	}
}
