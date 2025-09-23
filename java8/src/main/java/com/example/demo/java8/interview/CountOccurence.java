package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurence {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("dama", "Chandu", "Shekhar", "dama");
		Map<String, Long> countOccWords = names.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()));
		System.out.println(countOccWords);
	}
}
