package com.example.demo.java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Move0toLast {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 1, 5, 9, 3, 0, 4, 0, 5, 0));

//		for (int i = 0; i < list.size() - 1; i++) {
//			for (int j = 0; j < list.size() - 1; j++) {
//				if (list.get(j) == 0) {
//					Integer temp = 0;
//					temp = list.get(j);
//					list.set(j, list.get(j + 1));
//					list.set(j + 1, temp);
//				}
//			}
//		}
		
//		approch java7
		int intPos = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) != 0) {
				list.set(intPos++, list.get(i));
			}
		}
		while (intPos < list.size()) {
			list.set(intPos++, 0);
		}
		
		
		list.forEach(System.out::println);
	}

}
