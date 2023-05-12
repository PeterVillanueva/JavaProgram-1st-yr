
public class BubbleSort {

	public static void main(String[] args) {

		int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		System.out.print("Array Before Bubble Sort: ");

		for (int i : array) {
			System.out.print(" " + i);
		}

		bubbleSort(array);

		// Print the Output

		System.out.print("\nArray After Bubble Sort: ");

		for (int i : array) {
			System.out.print(" " + i);
		}

	}

	private static void bubbleSort(int array[]) {
		// Using For-Loop and If-Statement
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;
				}
			}
		}
	}
}