package com.example.demo.java8.interview.brushup;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String s = "swiss";
//		s.chars().mapToObj(c -> (char) c).collect(c -> c, Collectors.counting());

		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}	

		Character orElse = map.entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey).findFirst()
				.orElse(null);

		System.out.println(orElse);
	}

}
