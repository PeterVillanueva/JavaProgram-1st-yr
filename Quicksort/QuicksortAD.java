package Quicksort;

import java.util.Arrays;
import java.util.Scanner;

public class QuicksortAD {
	
	static int partitionAscending(int array[], int low, int high) {
		
		int pivot = array[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++) {
			if (array[j] <= pivot) { 
				i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		int temp = array[i + 1];
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
		
		int pivot = array[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++) {
			if (array[j] >= pivot) { 
				i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		int temp = array[i + 1];
		array[i + 1] = array [high];
		array[high] = temp;
		
		return (i + 1);
	}
	
	static void quicksortDescending(int array[], int low, int high) {
		if(low < high) {
			int pi = partitionDescending(array, low, high);
			quicksortDescending(array, low, pi -1);
			quicksortDescending(array, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number of Arra: ");
		int size = input.nextInt();
		
		int[] data = new int[size];
		
		System.out.print("Enter the Elements of Array: ");
		for(int i = 0; i < size; i++) {
			data[i] = input.nextInt();
		}
		
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(data));
		
		QuicksortAD.quicksortAscending(data, 0, size - 1);
		
		System.out.println("Array in Ascending Order");
		System.out.println(Arrays.toString(data));
		
		int[] data2 = Arrays.copyOf(data, size);
		
		QuicksortAD.quicksortDescending(data2, 0, size - 1);
		
		System.out.println("Array in Descending Order");
		System.out.println(Arrays.toString(data2));
		
		input.close();
	}
}
