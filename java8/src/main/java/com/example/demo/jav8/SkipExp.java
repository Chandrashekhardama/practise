package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;

public class SkipExp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 7, 9, 5, 6, 7, 1);
		nums.stream().skip(1).forEach(System.out::println);//skip index
	}
}
