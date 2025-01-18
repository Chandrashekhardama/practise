package binarysearch;

public class SmallestCharSearch {
	// 744. Find Smallest Letter Greater Than Target
	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'd';
		SmallestCharSearch sol = new SmallestCharSearch();
		char nextGreatestLetter = sol.nextGreatestLetter(letters, target);
		System.out.println(nextGreatestLetter);
	}

	public char nextGreatestLetter(char[] letters, char target) {

		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (letters[mid] == target) {
				return letters[mid];
			} else if (letters[mid] < target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
		// bcz here start will be end+1 -> thus its length that will get index outof
		// bond since the index are less than length,so start % by N that
		// will return 0 index which is correct
	}
}
