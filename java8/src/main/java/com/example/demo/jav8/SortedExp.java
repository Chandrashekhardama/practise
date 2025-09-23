package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedExp {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(9, 2, 5, 1, 3, 7, 6);
		Stream<Integer> sortedNum = num.stream().sorted();
		sortedNum.forEach(System.out::println);
	}
}
