package JavaProblems;

import java.util.*;

public class Swap2N {

	static void SwapValues(int m, int n) {

		m = m ^ n;
		n = m ^ n;
		m = m ^ n;

		System.out.println("\nThe Value of m is " + m + " \nand The Value of n is " + n);
	}

	public static void main(String[] args) {

		int m;
		int n;

		System.out.print("Enter a Number for m: ");
		Scanner scanner = new Scanner(System.in);

		m = scanner.nextInt();
		System.out.print("Enter a Number for n: ");

		n = scanner.nextInt();

		SwapValues(m, n);

		scanner.close();
	}

}
