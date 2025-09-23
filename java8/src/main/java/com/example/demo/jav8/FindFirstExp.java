package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 7, 9, 5, 6, 1);
		Optional<Integer> nu = nums.stream().filter(n -> n % 2 == 1).findFirst();
		System.out.println(nu.get());
	}

}
