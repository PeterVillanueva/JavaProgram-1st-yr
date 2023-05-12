package IfElseStatement;

import java.util.Scanner;

public class NumberValidation2 {

	private static Scanner input = new Scanner(System.in);
	private static int number;
	private static int length;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 99,999: ");
		number = input.nextInt();

		if (number >= 1 && number <= 9) {
			length = String.valueOf(number).length();
			System.out.println("The number is " + length + " Digit long.");
		}
		else if (number >= 1 && number <= 99) {
			length = String.valueOf(number).length();
			System.out.println("The number is " + length + " Digit(s) long.");
		} 
		else if (number >= 1 && number <= 999) {
			length = String.valueOf(number).length();
			System.out.println("The number is " + length + " Digit(s) long.");
		}
		else if (number >= 1 && number <= 9999) {
			length = String.valueOf(number).length();
			System.out.println("The number is " + length + " Digit(s) long.");
		}
		else if (number >= 1 && number <= 99999) {
			length = String.valueOf(number).length();
			System.out.println("The number is " + length + " Digit(s) long.");
			
			input.close();
		}

	}

}
