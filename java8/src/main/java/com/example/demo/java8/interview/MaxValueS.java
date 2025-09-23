package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxValueS {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 6, 8, 42, 6, 59, 5);
		int max = nums.stream().max(Comparator.naturalOrder()).orElse(0);
		System.out.println("max value:" + max);
	}
}
