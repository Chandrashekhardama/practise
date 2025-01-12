package dsastringandlist;

import java.util.ArrayList;
import java.util.List;

public class WordsContaingChars {

//2942. Find Words Containing Character
	/*
	 * You are given a 0-indexed array of strings words and a character x.
	 * 
	 * Return an array of indices representing the words that contain the character
	 * x.
	 * 
	 * Note that the returned array may be in any order.
	 */
	public List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(x) != -1) {
				res.add(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		WordsContaingChars solution = new WordsContaingChars();

		String[] words = { "apple", "banana", "grape", "cherry", "melon" };
		char x = 'a';

		List<Integer> result = solution.findWordsContaining(words, x);

		System.out.println("Indices of words containing the character '" + x + "': " + result);
	}
}
