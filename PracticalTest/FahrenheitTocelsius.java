package PracticalTest;

import java.util.*;
 
public class FahrenheitTocelsius implements ConvertTemp {
	private Scanner scanner = new Scanner(System.in);
	private double temp;

	public FahrenheitTocelsius() {
	}

	public void enterTemp() {
		System.out.print("Enter Temperature in Fahrenheit: ");

		temp = scanner.nextDouble();
	}

	public void compute() {
		double celsius;
		celsius = (temp - 32) * .5556;
		System.out.printf("Celsius: %.2f \n", celsius);

	}
}