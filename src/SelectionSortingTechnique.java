import utils.ArrayUtilFunctions;

/*
 * Selection Sorting Technique
 * ===========================
 * 	- Selection sorting is different from bubble sorting in a way that it allows element shift
 * only once per iteration.
 * 	- Here we can consider one reference element index either it can be index of max or min element.
 * 	- But the swapping of the element should occur only once. swapping should be n-1 times max
 *  - It is an stable algorithm since same elements at different indices wont retain their relative positions.
 *  - It is an in-place algorithm since it doesn't require new array creation for sorting process
 *
 * Time complexity:
 * ================
 * Worst	: O(n^2)	
 * 
 * Space Complexity:
 * =================
 * Worst : O(1)
 * 
 */
public class SelectionSortingTechnique {

	public static void main(String[] args) {
		int[] arr = { 3, 50, 2, 1, 5, 1 };
		int maxElementIndex;
		// lastUnsortedIndex is first pointing to the last index
		for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
		{
			// Considering the max element index to be the last unsorted element index 
			maxElementIndex = lastUnsortedIndex;
			for(int i = 0; i < lastUnsortedIndex; i++) {
				// Check if the element in maxElementIndex is smaller that the element at 'i' th index
				if (arr[maxElementIndex] < arr[i]) {
					// if so select index 'i' as the maxElementIndex
					maxElementIndex = i;
				}
			}
			// No need of swapping if the lastUnsortedIndex and MaxElementIndex are same
			// Because the condition explicitly denotes that the element is in correct index so no need to sort
			if (maxElementIndex != lastUnsortedIndex) {
				sortArray(arr, maxElementIndex, lastUnsortedIndex);		
			}
		}
		// Printing the elements in array
		ArrayUtilFunctions.printArray(arr);
	}

	/*
	 * Sort Array function is used to swap elements in array
	 * 
	 * @param[arr] integer array => array under test
	 * @param[x] integer => Index of the min element
	 * @param[y] integer => index of the max element
	 */
	public static void sortArray(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	


}
