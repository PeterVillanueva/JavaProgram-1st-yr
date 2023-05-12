import java.util.Scanner;

public class CafeOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Menu prices
		double coffeePrice = 2.50;
		double colaPrice = 1.75;
		double beerPrice = 3.00;
		double milkTeaPrice = 3.50;
		double cakePrice = 2.00;
		double sandwichPrice = 4.50;
		double baconPrice = 3.00;
		double carbonaraPrice = 5.00;

		// Ask user for drink and edible choices
		System.out.println("Welcome to our cafe! What would you like to order?");
		System.out.println("Drinks: coffee ($2.50), cola ($1.75), beer ($3.00), milk tea ($3.50)");
		System.out.println("Edibles: cake ($2.00), sandwich ($4.50), bacon ($3.00), carbonara ($5.00)");
		System.out.print("Drink choice: ");
		String drink = input.nextLine();
		System.out.print("Edible choice: ");
		String edible = input.nextLine();

		// Calculate total price
		double totalPrice = 0;
		switch (drink.toLowerCase()) {
		case "coffee":
			totalPrice += coffeePrice;
			break;
		case "cola":
			totalPrice += colaPrice;
			break;
		case "beer":
			totalPrice += beerPrice;
			break;
		case "milk tea":
			totalPrice += milkTeaPrice;
			break;
		default:
			System.out.println("Invalid drink choice.");
			return;

		}
		switch (edible.toLowerCase()) {
		case "cake":
			totalPrice += cakePrice;
			break;
		case "sandwich":
			totalPrice += sandwichPrice;
			break;
		case "bacon":
			totalPrice += baconPrice;
			break;
		case "carbonara":
			totalPrice += carbonaraPrice;
			break;
		default:
			System.out.println("Invalid edible choice.");
			return;
		}

		// Display total price
		System.out.printf("Your total price is: $%.2f\n", totalPrice + "Have a Nice Day!");

		input.close();
	}

}
