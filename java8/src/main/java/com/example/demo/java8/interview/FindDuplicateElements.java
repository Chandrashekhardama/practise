package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3);
//		Set<Integer> set = numbers.stream()
//								.filter(n -> Collections.frequency(numbers, n) > 1)
//								.collect(Collectors.toSet());
//		System.out.println(set);

		Set<Integer> list = numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1)
				.collect(Collectors.toSet());
		System.out.println(list);
	}
}
