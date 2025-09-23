package com.example.demo.java8.interview.brushup2;

public class Test {
	public static void main(String[] args) {
//		1. Write a program to check if a string is a palindrome.

//		String str = "malayalam";
//		String rev = "";
//		for (int i = str.toCharArray().length; i > 0; i--) {
//			char charAt = str.charAt(i - 1);
//			rev = rev + charAt;
//		}
//		if (str.equals(rev)) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}

//		2. How do you find duplicate elements in an array?
		int[] arr = { 2, 3, 4, 5, 5, 6, 6, 7 };
		int[] dup = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				dup[k] = arr[i];
				k++;
			}
		}
		for (int num : dup) {
			if (num != 0)
				System.out.println(num);
		}
	}

}
