package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeeingStream {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 6, 1, 3, 9, 7);
		Map<String, Double> collect = nums.stream()
											.collect(Collectors.teeing(Collectors.summingDouble(n -> n),
				Collectors.averagingDouble(n -> n), (sum, avg) -> Map.of("Sum", sum, "Avg", avg)));
		System.out.println(collect);
	}
}
