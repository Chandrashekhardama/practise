package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LogestWordinList {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
//		String max = words.stream().max(Comparator.comparingInt(w -> w.length())).orElse(null);
//		System.out.println(max);
		
		
		
		String orElse = words.stream().max(Comparator.comparingInt(w->w.length())).orElse(null);
		System.out.println(orElse);
		
	}
}
