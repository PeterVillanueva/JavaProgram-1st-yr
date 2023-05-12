
public class MainRecursion {

	public static void main(String[] args) {

		walk(5);
		System.out.println(factorial(7));
		System.out.println(power(2, 8));
	}

	private static void walk(int steps) {

		for (int i = 0; i < steps; i++) {
			System.out.println("You take a step!");
		}

	}

	private static int factorial(int num)

	{
		if (num < 1)
			return 1; // base case
		return num * factorial(num - 1); // recursive

	}

	private static int power(int base, int exponent) {
		if (exponent < 1)
			return 1; // base case
		return base * power(base, exponent - 1); // recursive case
	}

}
