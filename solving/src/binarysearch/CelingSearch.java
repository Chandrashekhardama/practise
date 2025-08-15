package binarysearch;

public class CelingSearch {
	
	//Celing for number - next nearer value to the target
	public static void main(String[] args) {

		int[] arr = { 2, 3, 6, 9, 13, 16, 39, 50 };
		int target = 30;

		CelingSearch sol = new CelingSearch();
		int result = sol.findTheCelingNumber(arr, target);
		if (result == -1) {
			System.out.println("No Element:");
		} else {
			System.out.println("Celing Element present in array:" + result);
		}
	}

	private int findTheCelingNumber(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		if (target > arr[end]) {
			return -1;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}
