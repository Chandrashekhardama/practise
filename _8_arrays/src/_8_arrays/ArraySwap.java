package _8_arrays;

import java.util.Arrays;

public class ArraySwap {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 1;
		arr[4] = 10;
		swap(arr, 0, 2); // Pass indices here

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " "); //6 5 2 1 10 // Print array elements instead of index
//		}

//		for (int val : arr) {
//			System.out.print(val + " "); // 6 5 2 1 10 // Print array elements instead of index
//		}

		System.out.print(Arrays.toString(arr));//[6, 5, 2, 1, 10]
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
