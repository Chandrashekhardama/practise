package com.example.demo.java8.askedinterview;

import java.util.HashMap;
import java.util.Map;

public class RearrangePalindrom {
	public static void main(String[] args) {
		System.out.println(checkPalindrom("add"));
		System.out.println(checkPalindrom("banglore"));
	}

	public static boolean checkPalindrom(String str) {
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		int oddCount = 0;
		for (int count : freq.values()) {
			if (count % 2 != 0) {
				oddCount++;
			}
		}

		if (str.length() % 2 == 0) {
			return oddCount == 0;
		} else {
			return oddCount == 1;
		}
	}

}
