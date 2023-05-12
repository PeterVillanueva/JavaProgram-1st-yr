package JavaProblems;

import java.util.*;

public class IntegerValue {

	public static void main(String[] args) {

		int num;
		
		System.out.print("Enter the Integer: ");
		
		Scanner scanner = new Scanner(System.in);

		num = scanner.nextInt();

		System.out.print("Entered Integer is:  " + num);

		scanner.close();
	}

}
