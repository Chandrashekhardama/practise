package dsastringandlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinIndexSum {
//599.Minimum Index Sum of Two Lists
	/*
	 * Given two arrays of strings list1 and list2, find the common strings with the
	 * least index sum.
	 * 
	 * A common string is a string that appeared in both list1 and list2.
	 * 
	 * A common string with the least index sum is a common string such that if it
	 * appeared at list1[i] and list2[j] then i + j should be the minimum value
	 * among all the other common strings.
	 * 
	 * Return all the common strings with the least index sum. Return the answer in
	 * any order.
	 */
	public String[] findRestaurant(String[] list1, String[] list2) {

		List<String> result = new ArrayList<>();
		HashMap<String, Integer> indexMap = new HashMap<>();

		for (int i = 0; i < list1.length; i++) {
			indexMap.put(list1[i], i);
		}

		int minIndex = Integer.MAX_VALUE;
		for (int j = 0; j < list2.length; j++) {
			if (indexMap.containsKey(list2[j])) {
				int indexVal = j + indexMap.get(list2[j]);
				if (indexVal < minIndex) {
					result.clear();
					result.add(list2[j]);
					minIndex = indexVal;
				} else if (indexVal == minIndex) {
					result.add(list2[j]);
				}
			}
		}
		return result.toArray(new String[0]);
	}

	public static void main(String[] args) {
		MinIndexSum solution = new MinIndexSum();

		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "KFC", "Shogun", "Burger King" };
		String[] result = solution.findRestaurant(list1, list2);

		System.out.println("Common restaurants with the smallest index sum: ");
		for (String restaurant : result) {
			System.out.println(restaurant);
		}
	}
}
