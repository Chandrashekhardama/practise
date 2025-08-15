package alearning;

import java.util.Scanner;

public class TestSortNSearch {

	public static void main(String[] args) {

		int[] arr = { 6, 2, 3, 5, 9, 7, 1 };
		int[] nums = sort(arr);
		System.out.println("*****Enter the target to be searched:");
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		int binarySearch = binarySearch(nums, target);
		if (binarySearch == -1) {
			System.out.println("target no found in array");
		} else {
			System.out.println("target found in array at index: " + binarySearch);
		}
	}

	public static int binarySearch(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		boolean asc = nums[start] < nums[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == nums[mid]) {
				return mid;
			}
			if (asc) {
				if (target < nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

	public static int[] sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			boolean swaped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) { // swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaped = true;
				}
			}
			if (!swaped) {
				break;
			}
		}

		return arr;
	}
}
