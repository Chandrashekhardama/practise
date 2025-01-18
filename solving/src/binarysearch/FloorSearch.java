package binarysearch;

public class FloorSearch {

	// floor of number
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 9, 13, 16, 39, 50 };
		int target = 1;

		FloorSearch sol = new FloorSearch();
		int result = sol.findFloorNumber(arr, target);
		if (result == -1) {
			System.out.println("No Element:");
		} else {
			System.out.println("Floor Element present in array:" + result);
		}
	}

	private int findFloorNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}

	public char nextGreatestLetter(char[] letters, char target) {

		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (letters[mid] < target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return letters[start];
	}

}
