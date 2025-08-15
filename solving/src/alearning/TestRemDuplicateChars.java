package alearning;

public class TestRemDuplicateChars {

	public static void main(String[] args) {
		String str = "Programming";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			boolean found = false;
			for (int j = 0; j < result.length(); j++) {
				if (c == result.charAt(j)) {
					found = true;
					break;
				}
			}
			if (!found) {
				result += c;
			}
		}
		
		System.out.println(result);//Progamin
	}
}
