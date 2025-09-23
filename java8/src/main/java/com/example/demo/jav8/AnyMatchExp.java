package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExp {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(20, 40, 70, 90, 50, 60, 70, 10);
		boolean anyMatch = nums.stream().anyMatch(n -> n % 20 == 0);
		System.out.println(anyMatch);//any value present 
	}

}
