/*
 * Insertion Sorting Technique
 * ============================
 * Insertion sorting is the process of sorting by growing the array.
 * 
 * - We consider the first element of the full array to be sorted part
 * - Then keep on adding the element next to the last sorted index element by sorting the entire sorted array
 * by keeping the new element intact.
 * - Continue the same process till all the element are sorted as required.
 * 
 * Time complexity:
 * ================
 * Worst Case : O(n^2)
 * 
 * InPlace algorithm : 
 * ==================
 * 		- Since no need of any new array creation for sorting.
 * 
 * Stable algorithm : 
 * ================= 
 *		- Since the relative position of the same elements wont change
 * 
 */
public class InsertionSortingTechnique {

	public static void main(String[] args) {
		int[] input = { 2, 5, 12, 7, 9, 2, 1 };
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++) {
			// Take the new element from the first unsorted index
			int newElement = input[firstUnsortedIndex];
			// we will need to trace the process so creating i separately
			int i;
			for (i = firstUnsortedIndex; i > 0 && newElement < input[i - 1]; i--) {
				// The below step will be executed only when the new element is less that the already sorted array elements
				input[i] = input[i - 1];
			}
			// Add the new element into its proper place
			input[i] = newElement;
		}
		// Print the array
		printArray(input);
	}

	/*
	 * Method to print array separated by commas
	 * 
	 * @param[arr] integer array => array under test
	 */
	private static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + "  ");
		}
	}

}
