package com.example.demo.java8.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class CountTheChars {
	public static void main(String[] args) {
		String input = "java";
		Map<Character, Long> freqMap = input.chars()
											.mapToObj(c -> (char) c)
											.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(freqMap);
	}
}
