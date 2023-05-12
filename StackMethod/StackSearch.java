package StackMethod;

import java.util.Stack;

public class StackSearch {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		// pushing elements into Stack
		stk.push("Mac Book");
		stk.push("HP");
		stk.push("DELL");
		stk.push("Asus");
		
		String stack = stk.toString().replace("[", "").replace("]", "");
		System.out.println("My Stack: " + stack);
		// Search an element
		int location = stk.search("HP");
		System.out.println("Location of Dell: " + location);
	}
}