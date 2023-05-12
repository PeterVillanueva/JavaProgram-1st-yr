package IfElseStatement;

public class CheckXY {

	private static int x;
	private static int y;

	public static void main(String[] args) {
		x = 15;
		y = 10;

		// Check if x > y
		if (x > y) {
			System.out.println("x is greater than y");
		}
		
		// Check if x = y
		else if (x == y) {
			System.out.println("x is equal to y");
		}

		// Check if x < y
		else {
			System.out.println("x is less than y");
		}
	}
}
