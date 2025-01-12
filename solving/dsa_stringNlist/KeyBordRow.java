package dsa_stringNlist;

import java.util.ArrayList;
import java.util.List;

public class KeyBordRow {

//	500. Keyboard Row
	/*
	 * Given an array of strings words, return the words that can be typed using
	 * letters of the alphabet on only one row of American keyboard like the image
	 * below.
	 * 
	 * Note that the strings are case-insensitive, both lowercased and uppercased of
	 * the same letter are treated as if they are at the same row.
	 * 
	 * In the American keyboard:
	 * 
	 * the first row consists of the characters "qwertyuiop", the second row
	 * consists of the characters "asdfghjkl", and the third row consists of the
	 * characters "zxcvbnm".
	 */
	public String[] findWords(String[] words) {

		String firstRow = "qwertyuiop";
		String secRow = "asdfghjkl";
		String thrRow = "zxcvbnm";

		List<String> result = new ArrayList<>();

		for (String word : words) {
			String lowWord = word.toLowerCase();
			if (checkWordExist(lowWord, firstRow) || checkWordExist(lowWord, secRow)
					|| checkWordExist(lowWord, thrRow)) {
				result.add(word);
			}
		}
		return result.toArray(new String[0]);
	}

	public boolean checkWordExist(String word, String row) {
		for (char c : word.toCharArray()) {
			if (row.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		KeyBordRow solution = new KeyBordRow();

		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		String[] result = solution.findWords(words);
		System.out.println("Words that can be typed using one row: ");
		for (String word : result) {
			System.out.println(word);
		}
	}
}
