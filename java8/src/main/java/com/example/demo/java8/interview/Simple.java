package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;

public class Simple {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "CC");
		names.forEach(System.out::println);
	}

}
