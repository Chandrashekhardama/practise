package alearning;

public class TestRevString {

	public static void main(String[] args) {

		String str = "Hello";
		String rev = "";

		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}

		System.out.println(rev);
	}
}
