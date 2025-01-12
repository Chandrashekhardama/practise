package dsastringandlist;

public class RevrseString {
//344. Reverse String
//	Write a function that reverses a string. The input string is given as an array of characters s.?
	public void reverseString(char[] s) {
		int start = 0, end = s.length - 1;
		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		RevrseString solution = new RevrseString();
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println("Original String: " + new String(s));
		solution.reverseString(s);
		System.out.println("Reversed String: " + new String(s));
	}
}
