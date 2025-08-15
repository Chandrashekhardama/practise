package alearning;

public class TestPalindrom {

	public static void main(String[] args) {

		String str = "abcba";
		boolean palindrom = true;

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				palindrom = false;
				break;
			}
		}

		System.out.println(palindrom ? "is palindrom" : "not palindrom");
	}
}
