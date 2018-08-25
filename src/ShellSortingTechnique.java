import Utils.ArrayUtilFunctions;
/*
 * Same as insertion sorting except that this sorting performs insertion sorting with some gap value
 * Formula to find the gap value:
 * =============================
 *   - gap = (3 ^ k) - 1 where k is set based on the length of the array.
 *   - we need to chose gap close to the lengTh of the array
 *   - But in the below program I am going to use gap = arraylength / 2.
 * 
 * This reduces the number of shifts needed for the insertion sorting.
 * 
 * - Inplace algorithm.
 * - Unstable algorithm
 * 
 * Time complexity :
 * 	Best: O(nlogn)
 * 	Average : Mostly depends on the gap sequences.
 * 	worst space complexity : O(n) total
 */

public class ShellSortingTechnique {
	public static void main(String[] args) {
		int[] array = { 67, 23, 56, 23, 8, 7, 3, 1, 8 };
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int newElement = array[i];
				int j = i;
				while (j >= gap && array[j - gap] > newElement) {
					array[j] = array[j - gap];
					j -= gap;
				}
				array[j] = newElement;
			}
		}
		ArrayUtilFunctions.printArray(array);
	}
}
