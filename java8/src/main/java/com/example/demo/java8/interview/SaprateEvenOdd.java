package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SaprateEvenOdd {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(9, 3, 1, 5, 6, 8, 7);
		Map<Boolean, List<Integer>> mapEvenOdd = nums.stream()
														.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(mapEvenOdd);
	}
}
