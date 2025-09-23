package com.example.demo.java8.interview.brushup;

import java.util.Map;
import java.util.stream.Collectors;

public class CharCount {

	public static void main(String[] args) {
		String str = "java";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	
		System.out.println(map);
	}

}
