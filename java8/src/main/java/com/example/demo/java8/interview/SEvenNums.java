package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;

public class SEvenNums {
	
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(2,6,8,42,6,59,5);
		nums.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
	}

}
