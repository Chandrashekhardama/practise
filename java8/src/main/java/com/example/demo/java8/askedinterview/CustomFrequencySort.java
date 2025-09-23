package com.example.demo.java8.askedinterview;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//Java code for custom frequency sort of characters in a string. Given a string, sort its character by frequency in the descending order. If two strings having same frequency, maintain their order of first appearance. Input TREE, output EETR.
public class CustomFrequencySort {

	public static void main(String[] args) {
		String str = "tree";
		System.out.println(checkFreq(str));
	}

	public static String checkFreq(String str) {
		Map<Character, Integer> frqMap = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			frqMap.put(c, frqMap.getOrDefault(c, 0) + 1);
		}

		List<Map.Entry<Character, Integer>> list = new ArrayList<>(frqMap.entrySet());

		list.sort((a, b) -> b.getValue() - a.getValue());

		StringBuilder cb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : list) {
			for (int i = 0; i < entry.getValue(); i++) {
				cb.append(entry.getKey());
			}
		}
		return cb.toString();
	}
}
