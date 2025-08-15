package linearSearch;

import java.util.Arrays;

public class TwoDarray {

	public static void main(String[] args) {
		int arr[][] = { { 2, 8, 5, },
						{ 32, 21, 27, 29 }, 
						{ 41, 43, }
					};
		int target = 27;

		int[] ans = linearSerch2DArray(arr, target);
		System.out.println(Arrays.toString(ans));
	}

	static public int[] linearSerch2DArray(int[][] arr, int target) {
		for (int row = 0; row < arr.length - 1; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (target == arr[row][col]) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}
}
