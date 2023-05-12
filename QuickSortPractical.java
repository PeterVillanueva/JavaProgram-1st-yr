
import java.util.*;

public class QuickSortPractical {
	
	static int pivot, temp, pi, i, j;
	
	public static int partition (int array[], int low, int high) {
		
		pivot = array[high];
		i = low - 1;
		
		for(j = low; j < high; j++) {
			if(array[j] <= pivot) {
				i++;
				
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		
		return(i + 1);
	}
	
	public static void quickSort (int array[], int low, int high) {
		if(low < high) {
			pi = partition(array, low, high);
			
			quickSort(array, low, pi -1);
			quickSort(array, pi + 1, high);
		}
	}
	
	// Descending Method
	
	public static int partitionDescending (int array[], int low, int high) {
		
		pivot = array[high];
		i = low - 1;
		
		for(j = low; j < high; j++) {
			if(array[j] >= pivot) {
				i++;
				
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		
		return(i + 1);
	}
	
	public static void quickSortDescending (int array[], int low, int high) {
		if(low < high) {
			pi = partitionDescending(array, low, high);
			
			quickSortDescending(array, low, pi -1);
			quickSortDescending(array, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the length of Array: ");
			int size = input.nextInt();
			int[] data = new int[size];
			
			System.out.print("Enter the Elements of Array: ");
			for(i = 0; i < size; i++) {
				data[i] = input.nextInt();
			}
			
			// Print the unsorted Arrays first
			
			System.out.println("Unsorted Arrays");
			System.out.println(Arrays.toString(data).replace("[", "").replace("]", ""));
			
			// Print the Ascending Arrays
			
			QuickSortPractical.quickSort(data, 0, size -1);
			
			System.out.println("Arrays in Ascending Order");
			System.out.println(Arrays.toString(data).replace("[", "").replace("]", "")); // to remove the square brackets
			
			// Print the descending Arrays
			
			int[] copy = Arrays.copyOf(data, size);
			
			QuickSortPractical.quickSortDescending(copy, 0, size -1);
			
			System.out.println("Arrays in Descending Order");
			System.out.println(Arrays.toString(copy).replace("[", "").replace("]", ""));
			
			input.close();
		}
	}

}
