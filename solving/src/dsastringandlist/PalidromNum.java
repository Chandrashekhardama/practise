package dsastringandlist;

public class PalidromNum {
//9 Palindrome Number--Given an integer x, return true if x is a 	palindrome	, and false otherwise.

	public boolean isPalindrome(int x) {

		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int org = x;
		int rev = 0;
		while (x > 0) {
			int digit = x % 10;
			rev = rev * 10 + digit;
			x /= 10;
		}

		return org == rev;
	}

	public static void main(String[] args) {
		PalidromNum solution = new PalidromNum();

		// Test cases
		int num1 = 121;
		int num2 = -121;
		int num3 = 10;
		int num4 = 0;

		// Checking each number
		System.out.println(num1 + " is palindrome?: " + solution.isPalindrome(num1));
		System.out.println(num2 + " is palindrome?: " + solution.isPalindrome(num2));
		System.out.println(num3 + " is palindrome?: " + solution.isPalindrome(num3));
		System.out.println(num4 + " is palindrome?: " + solution.isPalindrome(num4));
	}
}
