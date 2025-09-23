package com.example.demo.java8.interview.brushup2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecMax {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3, 4, 5, 6, 7, 9);
		arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
		;
	}
}
