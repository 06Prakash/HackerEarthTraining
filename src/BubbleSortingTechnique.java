import utils.ArrayUtilFunctions;

/*
 * Bubble sorting technique theory
 * ===============================
 * 
 * Bubble sort is a simple sorting algorithm. This sorting algorithm is 
 * comparison-based algorithm in which each pair of adjacent elements is 
 * compared and the elements are swapped if they are not in order.
 * In-place algorithm:
 * ===================
 *  - Since it doesn't require new array creation for sorting process
 * 
 * Here I am using bottom to top approach.
 *  - In which the largest element is pushed towards higher index.
 *  - If done in reverse it is Top to bottom approach.
 * 
 * In either of the way the array will be sorted at the end.
 * 
 * Stable algorithm:
 * =================
 *  - Since the relative position of the same elements wont be changed.
 * 
 *  - eg: in the below code the element 6 is repeated, after sorting the array, 6 at higher index
 * 			compared to the 6 at the lower index will retain its higher index relative to the 
 * 			one at lower index .
 * 
 * Worst algorithm for sorting:
 * ===========================
 * 	Lot of time consumed for sorting
 *  	- Best case: O(N)
 * 		- Worst Case: O(n^2)
 * 
 */
public class BubbleSortingTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 6, 2, 3, 4, 5, 6, 3 };
		// We have to take care of the last unsorted index every turn
		for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			// Then compare upto the last unsorted index element
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				// Place where swapping of element can be decided
				for (int j = i - 1; (j < i) && (array[i] < array[j]); j++) {
					// Calling the sorting function
					sortArray(array, i, j);
				}
			}
		}
		ArrayUtilFunctions.printArray(array);
	}

	/*
	 * Sort Array function is used to swap elements in array
	 * 
	 * @param[arr] integer array => array under test
	 * @param[x] integer => Index of the min element
	 * @param[y] integer => index of the max element
	 */
	private static void sortArray(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
