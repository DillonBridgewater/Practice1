
public class ArrayTester {
/**
 * 
 * @param arr2D
 * @param c
 * @return
 * +1 constructs int array of size arr2D.length
 * +1 accesses all items in one column of arr2D
 * +1 assigns one element from arr2d to the corressponding element in the new array
 * +1 returns new array with all elements from column of arr2D
 */
	public static int[] getColumn(int[][] arr2D, int c) {
	int[] result = new int[arr2D.length];
	for (int r=0; r< arr2D.length; r++) {
		result[r] = arr2D[r][c];
	}
	return result;
}
public static boolean containsDuplicates(int[] square) {
		for (int j=0; j<square.length; j++) {
			for (int i=0; i<square.length; i++) {
				if (j != i) {
					if (square[j] == square[i]) {
						return true;
					}
				}
			}
		}
		return false;
}
public static boolean hasAllValues(int[] arr1, int[] arr2) {
	int count = 0;
	for (int i =0; i<arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[i] == arr2[j] && count <= i) {
				count += 1;
			}
		}
	}
	if (count == arr1.length) {
		return true;
	}
	else {
		return false;
	}
}
public static boolean isLatin(int[][] square) {
	/**
	 * +1 calls referencing a row or column of square
	 */
	if (containsDuplicates(square[0]))
	{
		return false;
	}
	for (int r=1; r < square.length; r++) {
		/** 
		 * +1 calls hasallValues referencing two different rows, two different columns
		 * , or one row and one column
		 * +1 applies hasAll values to all rows or all columns
		 */
		if (!hasAllValues(square[0], square[r]))
		{
			return false;
		}
	}
	for (int c=0; c<square[0].length; c++)
	{
		/**
		 * +1 calls getColumn to obtain a valid column from square
		 */
		if(!hasAllValues(square[0], getColumn(square, c)))
		{
			return false;
		}
	}
	/**
	 * +1 returns true if all three Latin Square conditions are satisfied
	 */
	
	return true;
}

}
