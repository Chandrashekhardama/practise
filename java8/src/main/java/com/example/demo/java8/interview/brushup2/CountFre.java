package com.example.demo.java8.interview.brushup2;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFre {

	public static void main(String[] args) {
		String str = "programming";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		map.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
		
		
	}
}
