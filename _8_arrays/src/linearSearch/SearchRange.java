package linearSearch;

public class SearchRange {

	public static void main(String[] args) {

		int[] arr = { 21, 3, 5, 56, 89, 21 };
		int target = 5;
		System.out.println(searchRange(arr, target, 1, 4));
	}

	static int searchRange(int[] arr, int target, int start, int end) {

		if (arr == null) {
			return -1;
		}

		for (int index = start; index <= end; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		return -1;
	}
}
