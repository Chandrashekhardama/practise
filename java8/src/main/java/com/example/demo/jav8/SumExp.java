package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;

public class SumExp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 7, 9, 5, 6, 7, 1);
		int sum = nums.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum);//41
	}

}
