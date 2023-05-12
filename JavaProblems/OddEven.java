package JavaProblems;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		int num;

		System.out.print("Enter a Number: ");
		Scanner scanner = new Scanner(System.in);

		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("\n" + num + " is Even Number");
		}

		else {
			System.out.println("\n" + num + " is Odd Number");
		}

		scanner.close();
	}

}
