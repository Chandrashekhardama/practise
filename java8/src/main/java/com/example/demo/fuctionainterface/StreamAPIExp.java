package com.example.demo.fuctionainterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExp {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 5, 3, 4, 6);

//		nums.forEach(n -> System.out.println(n));
//		Stream<Integer> data = nums.stream();
		// 1.
//		data.forEach(n->System.out.println(n));

		// 2.
//		long count = data.count();
//		System.out.println(count);

		// 3.
//		Stream<Integer> sorted = data.sorted();
//		sorted.forEach(n->System.out.println(n));

		Integer reduce = nums.stream()
				.filter(n -> n % 2 == 1)//get only odd numbers
				.map(n -> n * 2)// multiply by 2 after filler
				.reduce(0,(c,e)->c+e); // sum of all- 0 initial , c carry , e element
		System.out.println(reduce);

//		for (int n : nums) {
//			System.out.println(n * 2);
//		}
	}

}
