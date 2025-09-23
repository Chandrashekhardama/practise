package com.example.demo.java8.interview.brushup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsMin {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 6, 4, 91, 2, 5, 8);
		Integer integer = nums.stream().min(Comparator.naturalOrder()).get();
		System.out.println(integer);
	}

}
