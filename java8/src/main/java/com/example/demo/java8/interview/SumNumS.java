package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;

public class SumNumS {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(6, 8, 1, 5, 3);
		int sum = nums.stream().reduce(0, (c, e) -> c + e);//23
//		int sum = nums.stream().reduce(0, Integer ::sum);
		System.out.println(sum);
	}

}
