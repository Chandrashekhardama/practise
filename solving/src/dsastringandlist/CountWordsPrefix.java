package dsastringandlist;

public class CountWordsPrefix {
//2185. Counting Words With a Given Prefix
	/*
	 * You are given an array of strings words and a string pref.
	 * 
	 * Return the number of strings in words that contain pref as a prefix.
	 * 
	 * A prefix of a string s is any leading contiguous substring of s.
	 */
	public int prefixCount(String[] words, String pref) {
		int apperance = 0;
		if (words.length == 0 && words == null) {
			return 0;
		}

		for (int i = 0; i < words.length; i++) {
			if (words[i].startsWith(pref)) {
				apperance++;
			}
		}
		return apperance;
	}

	public static void main(String[] args) {
		CountWordsPrefix solution = new CountWordsPrefix();

		String[] words = { "apple", "appetizer", "banana", "apricot", "grape" };
		String prefix = "app";

		int result = solution.prefixCount(words, prefix);

		System.out.println("Number of words that start with '" + prefix + "': " + result);
	}
}
