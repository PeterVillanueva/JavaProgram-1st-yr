package PracticalQuicksort;

import java.util.*;

public class Villanueva_PracticalQuicksort {
	
	static int pivot, i, temp, j, pi;

	static int partition(int array[], int low, int high) {

		pivot = array[high];
		i = low - 1;

		for (j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;

				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return (i + 1);
	}

	static void quickSort(int array[], int low, int high) {
		if (low < high) {
			pi = partition(array, low, high);

			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}

	static int partitionDescending(int array[], int low, int high) {

		pivot = array[high];
		i = low - 1;

		for (j = low; j < high; j++) {
			if (array[j] >= pivot) {
				i++;

				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return (i + 1);
	}

	static void quickSortDescending(int array[], int low, int high) {
		if (low < high) {
			pi = partitionDescending(array, low, high);
			quickSortDescending(array, low, pi - 1);
			quickSortDescending(array, pi + 1, high);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of Array: ");
		int size = input.nextInt();

		int [ ] data = new int[size];

		System.out.print("Enter the Elements of Array: ");
		for (int i = 0; i < size; i++) {
			data[i] = input.nextInt();
		}

		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(data));

		Villanueva_PracticalQuicksort.quickSort(data, 0, size - 1);

		System.out.println("Array in Ascending Order");
		System.out.println(Arrays.toString(data));

		int [ ] copy = Arrays.copyOf(data, size);

		Villanueva_PracticalQuicksort.quickSortDescending(copy, 0, size - 1);

		System.out.println("Array in Descending Order");
		System.out.println(Arrays.toString(copy));

		input.close();
	}
}
