package com.example.demo.java8.interview.brushup2;

import java.util.Map;
import java.util.stream.Collectors;

public class StringCountFre {
	public static void main(String[] args) {
		String str = "Programming";

		Map<Character, Long> grpByWord = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		grpByWord.entrySet().stream().filter(w -> w.getValue() > 1)
				.forEach(w -> System.out.println(w.getKey() + ":" + w.getValue()));
	}

}
