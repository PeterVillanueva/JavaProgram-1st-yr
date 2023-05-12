package VillanuevaFinals;

import java.util.*;

public class QuickSorts {
	
	public static int pivot, temp, pi, size, i, j;
	
	static int partitionAscending(int array[], int low, int high) {
		
		pivot = array[high];
		i = low - 1;
		
		for( j = low; j < high; j++) {
			if (array[j] <= pivot) { 
				i++;
				
			    temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		temp = array[i + 1];
		array[i + 1] = array [high];
		array[high] = temp;
		
		return (i + 1);
	}
	
	static void quicksortAscending(int array[], int low, int high) {
		if(low < high) {
			int pi = partitionAscending(array, low, high);
			quicksortAscending(array, low, pi -1);
			quicksortAscending(array, pi + 1, high);
		}
	}
	
	static int partitionDescending(int array[], int low, int high) {
		
		pivot = array[high];
		i = low - 1;
		
		for(j = low; j < high; j++) {
			if (array[j] >= pivot) { 
				i++;
				
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		temp = array[i + 1];
		array[i + 1] = array [high];
		array[high] = temp;
		
		return (i + 1);
	}
	
	static void quicksortDescending(int array[], int low, int high) {
		if(low < high) {
			pi = partitionDescending(array, low, high);
			quicksortDescending(array, low, pi -1);
			quicksortDescending(array, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number of Array: ");
		size = input.nextInt();
		
		int[] data = new int[size];
		
		System.out.println("Enter the Elements of Array: ");
		for(int i = 0; i < size; i++) {
			data[i] = input.nextInt();
		}
		
		System.out.println("Unsorted Array: " + Arrays.toString(data).replace("[", "").replace("]", ""));
		
		QuickSorts.quicksortAscending(data, 0, size - 1);
		
		System.out.println("Array in Ascending Order: " + Arrays.toString(data).replace("[", "").replace("]", ""));
		
		int[] copy = Arrays.copyOf(data, size);
		
		QuickSorts.quicksortDescending(copy, 0, size - 1);
		
		System.out.println("Array in Descending Order: " + Arrays.toString(copy).replace("[", "").replace("]", ""));
		
		input.close();
	}
}
