package bsmountainarray;

public class MountainArrayTarget {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 3;
		MountainArrayTarget sol = new MountainArrayTarget();
		System.out.println(""+sol.search(arr, target));

	}

	public int search(int[] arr, int target) {
		int peakIndex = peakIndexInMountainArray(arr);
		int result = orderAgnosticBs(arr, target, 0, peakIndex);
		if (peakIndex == -1) {
			return orderAgnosticBs(arr, target, 0, peakIndex);
		}
		return result;
	}

	private int orderAgnosticBs(int[] arr, int target, int start, int end) {
		boolean isAsc = false;
		if (arr[start] < arr[end]) {
			isAsc = true;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
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

	public int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				// desc
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}
