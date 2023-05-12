
import java.util.Stack;
import java.util.Scanner;

public class StackProduct {

	static int num1;
	static int num2;
	static int product;

	public static void Print(int num1, int num2) {

		System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Please Enter two Number: ");
		
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());

		num1 = stack.pop();
		num2 = stack.pop();
		product = num1 * num2;

		Print(num1, num2);
		
		scanner.close();
		
	}

}
