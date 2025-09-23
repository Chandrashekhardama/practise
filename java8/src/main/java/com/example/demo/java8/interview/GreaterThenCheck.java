package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;

public class GreaterThenCheck {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 20, 30, 40);
		boolean allMatch = num.stream().allMatch(n -> n > 50);
		System.out.println(allMatch); // n=5 true and 50 false
	}

}
