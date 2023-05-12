package JavaProblems;

import java.util.Scanner;

public class MultiplyFloatN {

	public static void main(String[] args) {

		float f1;
		float f2;

		System.out.print("Enter 1st Number: ");

		Scanner scanner = new Scanner(System.in);

		f1 = scanner.nextFloat();
		
		System.out.print("Enter 2nd Number: ");

		f2 = scanner.nextFloat();

		float p = f1 * f2;

		System.out.println("\nThe Product is: " + p);

		scanner.close();

	}

}
