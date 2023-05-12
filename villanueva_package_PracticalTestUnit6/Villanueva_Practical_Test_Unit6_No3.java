package villanueva_package_PracticalTestUnit6;

import java.util.Scanner;

public class Villanueva_Practical_Test_Unit6_No3 {

	public static void main(String[] args) {
		System.out.print("How many rows? ");
		Scanner scanner = new Scanner(System.in);

		int rows = scanner.nextInt();

		System.out.print("" + rows);
		System.out.print("\n");

		for (int a = 1; a <= rows; ++a) {
			for (int b = 1; b <= a; ++b) {
				System.out.print("* ");
			}

			System.out.println();
			scanner.close();

		}

	}
}