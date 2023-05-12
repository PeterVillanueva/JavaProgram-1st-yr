package ForDoWhileLoop;

import java.util.Scanner;

public class NameLoop {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name;
        
        do {
            System.out.print("Enter a name (or END to exit): ");
            name = input.nextLine();
            if (!name.equalsIgnoreCase("END")) {
                System.out.println("Name: " + name);
            }
        } while (!name.equalsIgnoreCase("END"));
        
        System.out.println("I am done.");
        input.close();
    }
}
