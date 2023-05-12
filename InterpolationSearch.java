
public class InterpolationSearch {

	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };

		int index = interpolationSearch(array, 1024);
		
		// using if else to determine if the int 256 is in our probe
		
		if (index !=-1 ) {
			System.out.println("Element Found at Index: " + index );
		}
		else {
			System.out.println("Element not Found: ");
		}

	}

	private static int interpolationSearch(int[] array, int value) {

		int high = array.length - 1;
		int low = 0;

		// Using While Loop

		while (value >= array[low] && value <= array[high] && low <= high) {

			int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

			// Print our probes
			
			System.out.println("Probe: " + probe);

			if (array[probe] == value) {
				return probe;

			} else if (array[probe] < value) {

				low = probe + 1;
			} else {
				high = probe - 1;
			}

		}

		return -1;
	}

}
