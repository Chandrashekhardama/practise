package linearSearch;

public class EvenNumDigits {
	// 1295. Find Numbers with Even Number of Digits
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, -7896 };
//		System.out.println(checkEvenDigit(nums));
		System.out.println(digit(-5555));// checking number digitss
	}

	static int checkEvenDigit(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (evenNum(num)) { // get even nums
				count++;
			}
		}
		return count;
	}

	static boolean evenNum(int num) {
		return digit(num) % 2 == 0; // cheking even or not
	}

	static int digit(int num) {
		int count = 0;
		if (num < 0) { // if its having -ve values then making +ve for while loop cdn match
			num = num * -1;
		}
		if (num == 0) {//since 0 is also one digits so, if input is 0 then digits is 1
			num = 1;
		}
		while (num > 0) {
			count++;
			num = num / 10; // getting no of digits
		}
		return count;
	}

}
