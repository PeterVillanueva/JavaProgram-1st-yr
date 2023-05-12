package IfElseStatement;

import java.util.Scanner;

public class NumberValidation {
	
	private static Scanner input = new Scanner(System.in);
	private static int number;
	private static int length;
	
	 public static void main(String[] args) {
		 
	        input = new Scanner(System.in);
	        System.out.print("Enter a number between 1 and 99,999: ");
	        number = input.nextInt();

	        if (number >= 1 && number <= 99999) {
	            length = String.valueOf(number).length();
	            System.out.println("The number is " + length + " digit(s) long.");
	        } else {
	            System.out.println("The number is not valid.");
	            
	            
	            input.close();
	        }
	    }
	}