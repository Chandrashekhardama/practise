package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatStingS {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Life", "is", "okay", "boss");

		String collect = names.stream().collect(Collectors.joining(" "));
		System.out.println(collect);
	}

}
