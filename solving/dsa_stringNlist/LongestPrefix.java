package dsa_stringNlist;

public class LongestPrefix {
	//14. Longest Common Prefix
	/*
	 * Write a function to find the longest common prefix string amongst an array of
	 * strings.
	 * 
	 * If there is no common prefix, return an empty string "".
	 */

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
			if (prefix.isEmpty()) {
				return "";
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		LongestPrefix solution = new LongestPrefix();

		// Test cases
		String[] strs1 = { "flower", "flow", "flight" };
		String[] strs2 = { "dog", "racecar", "car" };
		String[] strs3 = { "inter", "internet", "interview" };

		// Output results
		System.out.println("Longest Common Prefix for strs1: " + solution.longestCommonPrefix(strs1));
		System.out.println("Longest Common Prefix for strs2: " + solution.longestCommonPrefix(strs2));
		System.out.println("Longest Common Prefix for strs3: " + solution.longestCommonPrefix(strs3));
	}
}
