package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersFlatMap {
	public static void main(String[] args) {
		List<List<Integer>> nestedList = Arrays.asList( 
				Arrays.asList(1, 2, 3), 
				Arrays.asList(4, 5), 
				Arrays.asList(7,8,9));
		
		List<Integer> collect = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect);
	}

}
