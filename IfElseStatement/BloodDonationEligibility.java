package IfElseStatement;

import java.util.Scanner;

public class BloodDonationEligibility {

	private static Scanner input = new Scanner(System.in);
	private static int age;
	private static double weight;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		age = input.nextInt();
		if (age < 18) {
			System.out.println("Age must be greater than 18");
		}
		System.out.print("Enter your weight in kg: ");
		weight = input.nextDouble();

		if (age >= 18 && weight >= 50) {
			System.out.println("You are eligible to donate blood.");
		} else {
			System.out.println("You are not eligible to donate blood.");

			input.close();
		}
	}
}
