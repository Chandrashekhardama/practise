package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("madam", "racecar", "java", "level", "hello");
		List<String> collect = words.stream().filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}
}
