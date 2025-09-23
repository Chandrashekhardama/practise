package com.example.demo.java8.interview;

import java.util.stream.Stream;

public class GenerateFibenociSeries {
	public static void main(String[] args) {
		Stream<Integer> map = Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] })
									.limit(10)
									.map(f -> f[0]);
		map.forEach(System.out::println);
//		0
//		1
//		1
//		2
//		3
//		5
//		8
//		13
//		21
//		34
	}

}
