package interviewqn;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 5, 3, 8, 9, 12);
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > largest) {
				secondLargest = largest;
				largest = nums.get(i);
			} else if (nums.get(i) > secondLargest && nums.get(i) != largest) {
				secondLargest = nums.get(i);
			}
		}
		System.out.println("largest: " + largest);
		System.out.println("secondLargest: " + secondLargest);
	}
}
