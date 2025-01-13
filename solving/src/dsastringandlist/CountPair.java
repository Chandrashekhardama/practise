package dsastringandlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountPair {
	// 2824. Count Pairs Whose Sum is Less than Target
	/*
	 * Given a 0-indexed integer array nums of length n and an integer target,
	 * return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j]
	 * < target.
	 */
//95&
	public int countPairs(List<Integer> nums, int target) {
		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) + nums.get(j) < target) {
					result++;
				}
			}
		}
		return result;
	}

	// 42%
//	public int countPairs(List<Integer> nums, int target) {
//	    int result = 0;
//	    Collections.sort(nums); // Sort the list for two-pointer technique
//	    int left = 0, right = nums.size() - 1;
//	    while (left < right) {
//	        if (nums.get(left) + nums.get(right) < target) {
//	            result += (right - left); // Count all pairs (left, left+1, ..., right)
//	            left++;
//	        } else {
//	            right--;
//	        }
//	    }
//	    return result;
//	}

	public static void main(String[] args) {
		CountPair sol = new CountPair();
		List<Integer> nums = new ArrayList<>();
		nums.add(-1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(1);

		// Target value
		int target = 2;
		int res = sol.countPairs(nums, target);
		System.out.println(res);
	}

}
