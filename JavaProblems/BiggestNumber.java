package JavaProblems;

import java.util.Scanner;

public class BiggestNumber {
	
	static int largest, a, b, c;

	public static int biggestofThree(int x, int y, int z) {

		return z > (x > y ? x : y) ? z : ((x > y) ? x : y);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Three Numbers: ");

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		largest = biggestofThree(a, b, c);

		System.out.println(largest + " is the largest number.  ");

		scanner.close();

	}

}
