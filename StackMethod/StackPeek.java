package StackMethod;

import java.util.Stack;

public class StackPeek {

	public static void main(String[] args) {

		Stack<String> stk = new Stack<>();
		// pushing elements into Stack

		stk.push("Apple");
		stk.push("Grapes");
		stk.push("Mango");
		stk.push("Orange");

		String stack = stk.toString().replace("[", "").replace("]", "");
		System.out.println("Stack: " + stack);
		// Access element from the top of the stack
		String fruits = stk.peek();
		// prints stack
		System.out.println("Element at top: " + fruits);
	}
}