package brushup;

public class Binarysearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int target = 30;
		int search = search(arr, target);
		System.out.println("target found in index: " + search);
	}

	public static int search(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		boolean asc = arr[start] < arr[end];
		while (start <= end) {
			int mid = start +(end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (asc) {
				if (arr[mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (arr[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
