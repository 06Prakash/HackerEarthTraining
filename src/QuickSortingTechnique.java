import utils.ArrayUtilFunctions;

/* 
 * Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays.
 * 
 * We are partitioning arrays into smaller arrays same as merge sort except that it is the in-place algorithm
 * 
 * UnStableAlgorithm : 
 * ==================
 * Since the relative position of the same number will get modified
 * 
 * Since this algorithm has the average sorting time complexity as O(nlogn) which is same as best case time complexity
 * due to which it is considered as fastest sorting algorithm
 * 
 * In worst case Time complexity will go up to O(n^2).
 * 
 */
public class QuickSortingTechnique {

	public static void main(String[] args) {
		int[] array = { 4, 2, 5, 1, 6, 8, 3 };
		quickSort(array, 0, array.length);
		ArrayUtilFunctions.printArray(array);
	}

	public static void quickSort(int[] array, int start, int end) {
		// If difference between the end and the start index are less than 2
		// then it should be a single element array, so we dont have to process further
		// just return
		if (end - start < 2) {
			return;
		}
		// we need to find the pivot index from the given array
		// with the current start and end index
		int pivotIndex = partitionArray(array, start, end);
		// Quick sort is a recursive call to help the partitioning
		// to go till the single element in one side
		// This first function call will completely deal with the left sub-array
		quickSort(array, start, pivotIndex);
		// This second function call will completely deal with right sub-array
		quickSort(array, pivotIndex + 1, end);
	}

	public static int partitionArray(int[] array, int start, int end) {
		int pivotElement = array[start];
		int i = start;
		int j = end;
		// We need to ensure that that i < j which mean i never crosses j and vice
		// versa.
		while (i < j) {
			// i<j always needs to be traced
			// we are checking from the far right so we are decrementing j and comparing
			// Since element to the right of the pivot should be greater than the pivot
			// element
			// this loop will break only when the pivot is greater than the element at j
			// along with the
			// main condition i and j should not get crossed.
			while (i < j && pivotElement <= array[--j])
				;
			// Loop may have exited because i > j so check once
			if (i < j)
			// Since we are checking right element, movement should be to the left side
				array[i] = array[j];
			// we are checking from the far left so we are incrementing i and comparing
			// Since element to the left of the pivot should be lesser than the pivot
			// element
			// this loop will break only when the pivot is smaller than the element at j
			// along with the
			// main condition i and j should not get crossed
			while (i < j && pivotElement >= array[++i])
				;
			// Loop may have exited because i > j so check once
			if (i < j)
				// Since we are checking left element, movement should be to the right side
				array[j] = array[i];
		}
		// Put the pivot element in the right most index available
		// Since we are using the right most index to maintain the partition
		array[j] = pivotElement;
		// Return the index of the pivot element
		return j;
	}

}
