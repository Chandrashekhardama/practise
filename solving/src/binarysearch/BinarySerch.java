package binarysearch;

public class BinarySerch {

	public static void main(String[] args) {
//		int[] arr = { 100, 99, 95, 85, 80, 70,60,50 };
		int[] arr = { 50, 60, 70, 80, 85, 95, 99, 100 };
		int target = 86;
		BinarySerch sol = new BinarySerch();
		int targetIndex = sol.searching(arr, target);
		if (targetIndex == -1) {
			System.out.println("Target value does not exist in the array.");
		} else {
			System.out.println("Target found at index: " + targetIndex);
		}
	}

	private int searching(int[] arr, int target) {
		if (arr == null || arr.length < 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
