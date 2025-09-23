package com.example.demo.java8.interview;

import java.util.stream.Stream;

public class GenerateEvenNumbers {

	public static void main(String[] args) {
		Stream<Integer> limit = Stream.iterate(0, n -> n + 2)
									.limit(10);
		limit.forEach(System.out::println); //even 
		
		Stream<Integer> sq = Stream.iterate(0, n -> n +1)
									.limit(10)
									.map(n->n*n);
		sq.forEach(System.out::println); //squre
//		
		Stream<Integer> cube = Stream.iterate(0, n -> n +1)
									.limit(10)
									.map(n->n*n*n);
		cube.forEach(System.out::println); //cube
	}

}
