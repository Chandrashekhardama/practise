package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
		Stream<Integer> flatMap = Stream.of(list1, list2).flatMap(List::stream);
		flatMap.forEach(System.out::println);
	}

}
