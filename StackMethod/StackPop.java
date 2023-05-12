package StackMethod;

import java.util.*;

public class StackPop {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		System.out.println("stack: " + stk);
		// pushing elements into the stack
		pushElement(stk, 20);
		pushElement(stk, 13);
		pushElement(stk, 89);
		pushElement(stk, 90);
		pushElement(stk, 11);
		pushElement(stk, 45);
		pushElement(stk, 18);
		// popping elements from the stack
		popElement(stk);
		popElement(stk);
		// throws exception if the stack is empty
		try {
			popElement(stk);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}

	// performing push operation
	@SuppressWarnings("removal")
	static void pushElement(Stack<Integer> stk, int x) {
		// invoking push() method
		stk.push(new Integer(x));
		System.out.println("push -> " + x);
		// prints modified stack
		System.out.println("stack: " + stk);
	}

	// performing pop operation
	static void popElement(Stack<Integer> stk) {
		System.out.print("pop -> ");
		// invoking pop() method
		Integer x = (Integer) stk.pop();
		System.out.println(x);
		// prints modified stack
		System.out.println("stack: " + stk);
	}
}