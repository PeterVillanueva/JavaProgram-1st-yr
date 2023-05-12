package StackMethod;

import java.util.Stack;

public class StackSize {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		
		stk.push(22);
		stk.push(33);
		stk.push(44);
		stk.push(55);
		stk.push(66);
		// Checks the Stack is empty or not
		
		boolean result = stk.empty();
		System.out.println("Is the stack empty or not? " + result);
		// Find the size of the Stack
		int x = stk.size();
		System.out.println("The stack size is: " + x);
	}
}