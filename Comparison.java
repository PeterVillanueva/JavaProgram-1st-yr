
public class Comparison {
	
	static long startTime;
	static long endTime;
	static long elapsedTime;

	public static void main(String[] args) {
		
		int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		System.out.print("My Array: ");
		
		for(int i : array) {
			System.out.print(" " + i);
}
		
		bubbleSort(array);
		
		// Print the Output
		startTime = System.nanoTime();
		
		System.out.print("\nArray After Bubble Sort: ");
		
		for(int i : array) {
			System.out.print(" " + i);
		}
		endTime = System.nanoTime();
		System.out.println("BubbleSort:\t" + elapsedTime + "ns");
		
		quickSort(array, 0, array.length - 1);
		
		startTime = System.nanoTime();
		System.out.print("\nArray After Quick Sort: ");

		for (int i : array) {
			System.out.print(i + " ");
		}
		endTime = System.nanoTime();
		System.out.println("QuickSort:\t" + elapsedTime + "ns");

	}
	
	private static void quickSort(int[] array, int start, int end) {

		if (end <= start)
			return;// base case

		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);

	}

	private static int partition(int[] array, int start, int end) {

		int pivot = array[end];
		int i = start - 1;

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


	private static void bubbleSort(int array[]) {
		// Using For-Loop and If-Statement
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j + 1]) {
					int temp  = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
