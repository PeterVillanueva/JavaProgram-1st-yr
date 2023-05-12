package StackMethod;

import java.util.Iterator;
import java.util.Stack;

public class StackIterate {

	public static void main(String[] args) {
		// creating an object of Stack class
		Stack<String> stk = new Stack<String>();
		// pushing elements into stack
		stk.push("BMW");
		stk.push("Audi");
		stk.push("Ferrari");
		stk.push("Bugatti");
		stk.push("Jaguar");
		// iteration over the stack
		Iterator<String> iterator = stk.iterator();
		while (iterator.hasNext()) {
			Object values = iterator.next();
			System.out.println(values);
		}
	}
}