package linearSearch;

public class TwoDarrayMax {
	public static void main(String[] args) {

		int arr[][] = { { 2, 8, 5, },
						{ 32, 21, 27, 29 },
						{ 41, 43 }
					};

		System.out.println(max2DArray(arr));
		System.out.println(min2DArray(arr));

	}

	static int max2DArray(int[][] arr) {
		int max = Integer.MIN_VALUE;

		for (int[] rows : arr) {
			for (int element : rows) {
				if (max < element) {
					max = element;
				}
			}
		}
		return max;
	}

	static int min2DArray(int[][] arr) {
		int max = Integer.MAX_VALUE;

		for (int[] row : arr) {		//here row has 2, 8, 5
			for (int element : row) {//here elemnt has 2 in 1st loop, 8in 2nd loop, 5 in 3rd loop
				if (max > element) {
					max = element;
				}
			}
		}
		return max;
	}
}
