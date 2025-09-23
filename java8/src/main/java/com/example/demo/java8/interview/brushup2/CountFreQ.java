package com.example.demo.java8.interview.brushup2;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFreQ {

	public static void main(String[] args) {
		String str = "Programming";
		Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		collect.entrySet().stream().filter(c -> c.getValue() > 1)
				.forEach(c -> System.out.println(c.getKey() + ":" + c.getValue()));
	}
}
