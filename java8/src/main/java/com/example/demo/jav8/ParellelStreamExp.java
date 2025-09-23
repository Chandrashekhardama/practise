package com.example.demo.jav8;

import java.util.Arrays;
import java.util.stream.LongStream;

public class ParellelStreamExp {

	public static void main(String[] args) {
		
		long[] list = new long[20000];
		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;//load data in array
		}

		long start = System.currentTimeMillis();
		Arrays.stream(list).map(ParellelStreamExp::factorial).sum();
		long end = System.currentTimeMillis();
		System.out.println("seqencial stream time:" + (end - start) + "ms");

		
		//parallel stream logic
		long startParellel = System.currentTimeMillis();
		Arrays.stream(list).parallel()
								.map(ParellelStreamExp::factorial) //main class to map
								.sum();
		long endParellel = System.currentTimeMillis();
		System.out.println("parellel stream start time:" + (endParellel - startParellel) + "ms");
		
//		seqencial stream time:267ms
//		parellel stream start time:60ms


	}

	public static long factorial(long n) {
		long fact = LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
		return fact;
	}

}
