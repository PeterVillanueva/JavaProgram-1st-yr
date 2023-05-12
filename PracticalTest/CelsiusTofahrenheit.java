package PracticalTest;

import java.util.*;

public class CelsiusTofahrenheit implements ConvertTemp {
	private Scanner scanner = new Scanner(System.in);
	private double temp;

	public CelsiusTofahrenheit() {

	}

	public void enterTemp() {
		System.out.print("Enter Temperature in Celsius: ");

		temp = scanner.nextDouble();

	}

	public void compute() {
		double fahrenheit;
		fahrenheit = (temp * 9 / 5) + 32;
		System.out.printf("Fahrenheit: %.2f \n", fahrenheit);

	}

}
