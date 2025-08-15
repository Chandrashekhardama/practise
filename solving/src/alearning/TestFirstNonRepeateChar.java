package alearning;

public class TestFirstNonRepeateChar {

	public static void main(String[] args) {
		String str = "Swiss";

		for (int i = 0; i < str.length() - 1; i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
			}
			if(unique) {
				System.out.println("unique:"+ str.charAt(i));
				break;
			}
		}
	}
}
