package nl.nijenhuis.cc4.helpers;

public class UtilArray {

	/**
	 * takes an array size and returns an int array containing all the indexes
	 * contained in that array
	 */
	public static int[] getArrayIndexes(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = i;
		}
		return array;
	}
}
