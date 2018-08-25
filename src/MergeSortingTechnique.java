import Utils.ArrayUtilFunctions;

/*
 * Merge sorting is based on splitting arrays in to many arrays
 * and then merging them back to the fully sorted array.
 * 
 * Here we have to split the single array into a group of one element array.
 * Which at the end of splitting we will get a group of sorted array.
 * Then we have to keep on merging one by one by sorting them
 * And keep on following the same process to arrive at the sorted array, we needed.
 * 
 * Time Complexity : O(nlogn) - base 2 since we are keep on splitting the array 
 * ===============
 * into half during the split phase
 * 
 * Stable algorithm => Since same elements relative position in the array wont change.
 * 
 * Not an inplace algorithm => Since we need to create one more array in addition to the input
 * 								array for sorting process
 */
public class MergeSortingTechnique {

	public static void main(String[] args) {
		int[] input = { 2, 5, 1, 6, 8, 2, 1 };
		int startIndex = 0;
		int endIndex = input.length;
		mergeSort(input, startIndex, endIndex);
		ArrayUtilFunctions.printArray(input);
	}

	// Main control area for performing the split and sorting of elements
	private static void mergeSort(int[] input, int start, int end) {
		// Check whether there are atleast three elements to split
		if (end - start < 2) {
			return;
		}
		// Find the mid point of the two array to split
		int mid = (start + end) / 2;
		// The below two lines are recursively used to split the array logically
		// The first line for left array split
		// The second line for right array split
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		// The below line will help in the merging of two arrays which are logically
		// created
		merge(input, start, mid, end);
	}

	// Merge function to merge the logically splitted two sorted arrays
	private static void merge(int[] input, int start, int mid, int end) {
		if (input[mid - 1] <= input[mid]) {
			return;
		}
		int[] tempArray = new int[end - start];
		int i = start;
		int j = mid;
		int tempIndex = 0;
		while (i < mid && j < end) {
			tempArray[tempIndex++] = input[i] >= input[j] ? input[j++] : input[i++];
		}
		// Copying the input array to input array in such a to prevent the lose of
		// Some elements that are to be merged
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		// Merge the temp array atlast with the input array to complete
		// sorting of the two sorted array element into single sorted
		// array elements
		System.arraycopy(tempArray, 0, input, start, tempIndex);
	}

}
