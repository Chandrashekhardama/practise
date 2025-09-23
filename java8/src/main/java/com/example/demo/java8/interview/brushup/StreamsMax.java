package com.example.demo.java8.interview.brushup;

import java.util.Arrays;
import java.util.List;

public class StreamsMax {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 6, 4, 91, 2, 5, 8);
		nums.stream()
//				.max(Comparator.naturalOrder()).get();
				.sorted((a, b) -> b - a).skip(2).limit(1).forEach(n -> System.out.println(n));
	}
}
