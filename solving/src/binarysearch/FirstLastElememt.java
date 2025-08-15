package binarysearch;

public class FirstLastElememt {
	// 34. Find First and Last occurrence Position of Element in Sorted Array==[3,4]
	public static void main(String[] args) {
		FirstLastElememt sol = new FirstLastElememt();
		int[] nums = { 5, 7, 7, 7, 8, 8, 10 };
		int target = 7;
		int[] solutions = sol.searchRange(nums, target);
		for (int solution : solutions) {
			System.out.print("index: " + solution + " ");
		}
	}

	public int[] searchRange(int[] nums, int target) {
		int[] res = { -1, -1 };
		res[0] = serch(nums, target, true);
		if (res[0] != -1) {
			res[1] = serch(nums, target, false);
		}
		return res;
	}

	public int serch(int[] nums, int target, boolean isfirstElement) {
		int start = 0;
		int end = nums.length - 1;
		int ans = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if (isfirstElement) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}
