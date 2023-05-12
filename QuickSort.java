
public class QuickSort {

	public static void main(String[] args) {

		int[] array = { 24, 9, 25, 14, 19, 27 };

		// print our array before sorting
		System.out.println("Array Before Sorting: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		// print our array after quicksort method

		System.out.println("Array After Sorting: ");
		quickSort(array, 0, array.length - 1);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] array, int start, int end) {

		if (end <= start)
			return; // base case

		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);

	}

	private static int partition(int[] array, int start, int end) {

		int pivot = array[end];
		int i = start - 1;

		// Using For Loop

		for (int j = start; j <= end - 1; j++) {
			if (array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;

		return i;
	}
}
