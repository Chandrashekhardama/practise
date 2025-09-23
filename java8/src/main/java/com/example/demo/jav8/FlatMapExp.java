package com.example.demo.jav8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapExp {

	public static void main(String args[]) {
		List<List<String>> nums = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"),
				Arrays.asList("E", "F"));
		nums.stream().flatMap(Collection::stream).forEach(System.out::println);//method refrence
//		nums.stream().flatMap(list -> list.stream()).forEach(System.out::println);//lamba exp
	}

}
