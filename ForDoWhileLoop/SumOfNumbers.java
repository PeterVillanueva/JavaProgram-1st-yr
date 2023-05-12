package ForDoWhileLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        
        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number >= 0) {
                sum += number;
            }
        } while (number >= 0);
        
        System.out.println("Sum of all entered numbers: " + sum);
        input.close();
    }
}
