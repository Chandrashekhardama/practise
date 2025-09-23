package com.example.demo.jav8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExp {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 9, 5, 62, 47, 86);
		
		Optional<Integer> min = nums.stream().min(Comparator.naturalOrder());
//		Optional<Integer> min = nums.stream().max(Comparator.reverseOrder());
		System.out.println(min.get());//5
		
		Optional<Integer> max = nums.stream().max(Comparator.naturalOrder());
		System.out.println(max.get());//86

	}

}
