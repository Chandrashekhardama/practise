package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBySize {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("dama", "Chandu", "Shekhar", "mada");
		Map<Integer, List<String>> collect = names.stream()
													.collect(Collectors.groupingBy(n -> n.length()));
		System.out.println(collect);
	}
}
