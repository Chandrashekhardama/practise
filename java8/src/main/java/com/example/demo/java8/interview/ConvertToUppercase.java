package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("aa", "bb", "cc", "dd");
		List<String> uppercaseNames = names.stream()
											.map(String::toUpperCase)
											.collect(Collectors.toList());
		uppercaseNames.forEach(System.out::println);
	}

}
