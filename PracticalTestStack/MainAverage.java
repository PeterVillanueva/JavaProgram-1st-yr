package PracticalTestStack;

import java.util.Stack;

public class MainAverage {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		double average;

		stack.push(90);
		stack.push(97);
		stack.push(99);
		stack.push(92);
		stack.push(91);
		stack.push(94);
		stack.push(99);
		stack.push(93);
		stack.push(96);
		stack.push(99);
		
		String grades = stack.toString().replace("[", "").replace("]", "");

		System.out.println("My Grades: " + grades);
		
		int sum = 0;
		for (int value : stack) {
			sum += value;
		}
		average = (double) sum / stack.size();

		System.out.println("My Average Grade is: " + average);

	}

}
