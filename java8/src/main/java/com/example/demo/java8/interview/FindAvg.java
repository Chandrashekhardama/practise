package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;

public class FindAvg {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 20, 30, 40);
		double avg = num.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
	}

}
