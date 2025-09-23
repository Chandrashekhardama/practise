package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FillerExp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 3, 5, 6, 8, 9);
		Stream<Integer> filter = nums.stream().filter(n -> n % 2 == 1);
		filter.forEach(System.out::println);
	}

}
