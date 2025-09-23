package com.example.demo.java8.interview.brushup;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartition {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 6, 4, 91, 2, 5, 8);

		Map<Boolean, List<Integer>> evn = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(evn);
	}

}
