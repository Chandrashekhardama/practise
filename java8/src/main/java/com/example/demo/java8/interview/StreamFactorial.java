package com.example.demo.java8.interview;

import java.util.stream.IntStream;

public class StreamFactorial {

	public static void main(String[] args) {
		Integer num = 5;
		int factorial = IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
		System.out.println(factorial);
	}

}
