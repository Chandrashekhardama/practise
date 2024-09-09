package linearSearch;

public class StringSearch {

	public static void main(String[] args) {
		String str = "chandu";
		char target = 'x';
//		System.out.println(stringLinSearch(str, target));
		System.out.println(stringLinSearchElement(str, target));

	}
	//if present then true else false
	static boolean stringLinSearch(String str, char target) {
		if (str == null)
			return false;

		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	//if present then value else 0
	static char stringLinSearchElement(String str, char target) {
		if (str == null)
			return 0;

		for (char ch : str.toCharArray()) {
			if (target == ch) {
				return ch;
			}
		}
		return 0;
	}
}
