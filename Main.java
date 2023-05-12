
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// declare a stack object
		Stack<Integer> stack = new Stack<Integer>();
		// print initial stack
		System.out.println("Initial stack: " + stack);
		// isEmpty()
		System.out.println("Is Stack Empty: " + stack.isEmpty());
		// push() Operation
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		// print non-empty stack
		System.out.println("Stack after push operation: " + stack);
		// pop() Operation
		System.out.println("Element popped out: " + stack.pop());
		System.out.println("Stack after pop operation: " + stack);
		// search() Operation
		System.out.println("Element 10 found at position: " + stack.search(10));
		System.out.println("Is Stack Empty?: " + stack.isEmpty());

	}

}
