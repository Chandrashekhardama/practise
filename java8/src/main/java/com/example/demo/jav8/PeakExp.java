package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeakExp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 6, 4, 1, 9, 5);
		nums.stream()
//			.peek(System.out::println)
			.map(n -> n * n)
			.peek(System.out::println)
			.collect(Collectors.toList());
	}
}
