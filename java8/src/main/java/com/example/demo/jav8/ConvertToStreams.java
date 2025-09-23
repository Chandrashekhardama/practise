package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStreams {

	public static void main(String[] args) {
		int[] primitiveData = { 1, 2, 3, 4, 5 };
		IntStream stream = Arrays.stream(primitiveData);
		stream.forEach(System.out::println);

		Integer[] objArray = { 1, 2, 3, 4, 5 };
		Stream<Integer> of = Stream.of(objArray);
		of.forEach(System.out::println); // ::method refrence

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().forEach(System.out::println);
	}

}
