package brushup;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] twoSum = twoSum(nums, target);
		for (int num : twoSum) {
			System.out.println(num);

		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (map.containsKey(temp)) {
				return new int[] { map.get(temp), i };
			}
			map.put(nums[i], i);
		}

		return nums;
	}

}
