package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringAlphRev {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
		List<String> collect = names.stream()
										.sorted(Comparator.reverseOrder())
										.collect(Collectors.toList());
		System.out.println(collect);
	}

}
