package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecLargest {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(9, 3, 1, 5, 6, 8, 7);
		Optional<Integer> secHigh = nums.stream()
									.sorted(Comparator.reverseOrder())
									.skip(1) //if 3rd then skip 2
									.findFirst();
		System.out.println(secHigh.get());
	}
}
