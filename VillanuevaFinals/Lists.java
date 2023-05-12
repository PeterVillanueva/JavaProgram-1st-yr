package VillanuevaFinals;

import java.util.*;

public class Lists {
	
	public static int list, i;
	public static String originalListString, uniqueListString;
	private static ArrayList<Integer> listWithDuplicates, listWithoutDuplicates;
	private static HashSet<Integer> set;
	private static Scanner scan;
	
    public static void main(String[] args) {
        
        // Create an ArrayList with duplicate values
        listWithDuplicates = new ArrayList<Integer>();
        scan = new Scanner(System.in); // Initialize Scanner object
        
        System.out.println("Hello Student, Please Enter your ArrayLists: ");
        
        for (i = 0; i < 10; i++) {
			
			try {
				list = scan.nextInt();
				listWithDuplicates.add(list); // Add user input to ArrayList
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, Please Enter your Lists: ");
				scan.next();
				i--; // Decrement the loop counter to repeat the input
			}
		}
        
        // Use a HashSet to remove duplicates
        set = new HashSet<Integer>(listWithDuplicates);
        
        // Create a new ArrayList with unique values
        listWithoutDuplicates = new ArrayList<Integer>(set);
        
        originalListString = listWithDuplicates.toString().replace("[", "").replace("]", "");
        uniqueListString = listWithoutDuplicates.toString().replace("[", "").replace("]", "");
        
        // Print the original and unique ArrayLists
        System.out.println("Original ArrayList: " + originalListString);
        System.out.println("Unique ArrayList: " + uniqueListString);
        
        scan.close();
    }
}
