package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;

public class LimitExp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 7, 9, 5, 6, 7);
		
		nums.stream().limit(3).forEach(System.out::println);//retun single number
		
//		2
//		4
//		7


	}
}
