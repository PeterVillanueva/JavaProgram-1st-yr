package VillanuevaFinals;
import java.util.*; 

public class Stacks {
	
	public static int n1, n2, sum, value, i, grade;
	public static double average;
	public static String grades;
	private static Scanner scan;
	private static Stack<Integer> stack;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in); 
		stack = new Stack<Integer>(); 

		System.out.println("Hello Student, Please Enter your Grades: "); 
		
		for (i = 0; i < 10; i++) {
			
			try {
				grade = scan.nextInt();
				stack.push(grade); 
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, Please Enter your Grades: ");
				scan.next();
				i--; 
			}
		}
		
		grades = stack.toString().replace("[", "").replace("]", "");
		
		System.out.println("My Grades in Different Majors: ");
		System.out.println(grades); 
		
		sum = 0;
		for (int value : stack) {
			sum += value;
		}
		
		average = sum / stack.size(); 
		
		System.out.println("My Average Grade is: " + average);
		
		scan.close();
	}

}
