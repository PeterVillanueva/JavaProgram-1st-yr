
import java.util.*;

public class StackAverage {

	static int num1;
	static int num2;
	static int sum;
	static int value;
	static double average;
	static String grades;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("Enter your Grades: ");

		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());
		stack.push(scanner.nextInt());

		grades = stack.toString().replace("[", "").replace("]", "");

		System.out.println("\n" + "My Grades in Different Majors: " + grades);

		sum = 0;
		for (int value : stack) {
			sum += value;
		}

		average = sum / stack.size();

		System.out.println("My Average Grade is: " + average);

		scanner.close();
	}

}
