package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;

public class ReduceExp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 7, 9, 5, 6, 7, 1);
		Integer reduce = nums.stream()
				.filter(n -> n % 2 == 1)
				.reduce(0, (c, e) -> c + e); //0 start value, c - carry, e - element
		System.out.println(reduce);
	}
}
