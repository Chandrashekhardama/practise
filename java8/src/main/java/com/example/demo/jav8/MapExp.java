package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExp {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 5, 9, 4, 1);
		Stream<Integer> mapNum = nums.stream().map(n -> n * 2);
		mapNum.forEach(System.out::println);
	}
}
