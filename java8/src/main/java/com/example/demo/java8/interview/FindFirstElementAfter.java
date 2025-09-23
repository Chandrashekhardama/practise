package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindFirstElementAfter {
//find first greater than 10
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 50, 12, 3, 4, 9);
		int findFirst = nums.stream()
						.filter(n -> n > 10)
						.sorted(Comparator.naturalOrder())
						.findFirst()
						.orElse(-1);
		System.out.println(findFirst);//12

	}
}
