package control_structures;

import java.util.*;

public class Do_While_Loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
		int i = scanner.nextInt();
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 10);
		
	scanner.close();
	}

}
