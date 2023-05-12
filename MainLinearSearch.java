
public class MainLinearSearch {

	public static void main(String[] args) {

		int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		System.out.print("Our Array: ");
		
		for (int i : array) {
			System.out.print(i + " ");
		}
		
		int index = linearSearch(array, 5);
		
		if(index != -1) {
			System.out.println("\nElement found at index: " +  index);
		
		}
		else {
			System.out.println("]nElement not found" );
		}
	}

	private static int linearSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		
		return -1;
	}

}
