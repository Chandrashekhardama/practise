package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;

public class DistinctExp {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(0, 3, 5, 6, 5, 8, 9, 4, 4, 0);
		nums.stream().distinct().forEach(System.out::println);
	}

}
