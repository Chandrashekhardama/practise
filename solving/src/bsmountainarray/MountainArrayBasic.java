package bsmountainarray;

public class MountainArrayBasic {
	// 852. Peak Index in a Mountain Array and 162. Find Peak Element -only sol
	// Biotonic/peak array:1st some of digits are in asc later desc and contains
	// non-duplicate digits
	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 9, 6, 3 };
		MountainArrayBasic sol = new MountainArrayBasic();
		System.out.println(sol.searching(arr));
	}

	private int searching(int[] arr) {
		if (arr == null || arr.length < 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				/*
				 * you are in desc part of array - this may be the and but look at left thats
				 * why end!=mid+1, current mid also we need to comprare with left ones
				 */
				end = mid;
			} else {
				// you are in asc part of array
				start = mid + 1;
				/*
				 * in the end last check b4 loop terminate,start==end and pointing to single
				 * index that what our ans is bcz start and end always finding the max element
				 * in above 2 checkes hence its pointing to just one element thats the max
				 * element
				 */
			}
		}
		return start;
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
