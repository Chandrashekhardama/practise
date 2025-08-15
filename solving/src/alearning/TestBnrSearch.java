package alearning;

public class TestBnrSearch {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 4, 6, 8, 10, 12, 15 };
		int target = 10;
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
}
