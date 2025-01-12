package dsastringandlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MinimumIndexSum  {
	//599. Minimum Index Sum of Two Lists
	/*
	 * Given two arrays of strings list1 and list2, find the common strings with the
	 * least index sum. A common string is a string that appeared in both list1 and
	 * list2. A common string with the least index sum is a common string such that
	 * if it appeared at list1[i] and list2[j] then i + j should be the minimum
	 * value among all the other common strings. Return all the common strings with
	 * the least index sum. Return the answer in any order.
	 */
	public static String[] findRestaurant(String[] list1, String[] list2) {

		List<String> result = new ArrayList();

		HashMap<String, Integer> mapL1 = new HashMap<>();
		int minIndexSum = Integer.MAX_VALUE;
		for (int i = 0; i < list1.length; i++) {
			mapL1.put(list1[i], i);
		}

		for (int j = 0; j < list2.length; j++) {
			if (mapL1.containsKey(list2[j])) {
				int indexSum = j + mapL1.get(list2[j]);
				if (indexSum < minIndexSum) {
					result.clear();
					result.add(list2[j]);
					minIndexSum = indexSum;
				} else if (minIndexSum == indexSum) {
					result.add(list2[j]);
				}
			}
		}
		return result.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String[] list1 = { "happy", "sad", "good" };
		String[] list2 = { "sad", "happy", "good" };
		String[] result = findRestaurant(list1, list2);
		System.out.println("Common restaurants with minimum index sum:");
		for (String word : result) {
			System.out.println(word);
		}
	}

}