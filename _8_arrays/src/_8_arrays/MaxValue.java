package _8_arrays;

public class MaxValue {
	public static void main(String[] args) {
		int[] arr = { 9, 5, 85, 66, 15 };
		System.out.println(max(arr));//85
	}

	public static int max(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
