package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.management.RuntimeErrorException;

public class MinValue {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 50, 12, 3, 4, 9);
		
		Integer minVal = nums.stream().min(Comparator.naturalOrder()).orElseThrow(()-> new RuntimeErrorException(null, "No elemets found"));
		System.out.println(minVal);
	}

}
