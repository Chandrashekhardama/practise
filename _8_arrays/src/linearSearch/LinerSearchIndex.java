package linearSearch;

public class LinerSearchIndex {
	public static void main(String[] args) {
		int[] arr = { 25, 95, 2, 66, 26, 75, -1, -55, 99 };
		int target = -1;
//		int result = linearSerch(arr, target);
		int result = linearSerchElement(arr, target);
//		boolean result = linearSerchBool(arr, target);
		System.out.println(result);
	}

	static int linearSerch(int arr[], int target) {
		// check for null
		if (arr == null) {
			return -1;
		}
		// will loop through
		for (int index = 0; index < arr.length; index++) {
			// check element at every index if it = target
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		// this will excute if target not found
		// bcz -1 index never present in code
		return -1;
	}

	static int linearSerchElement(int arr[], int target) {
		if (arr == null) {
			return Integer.MAX_VALUE;
		}
		for (int index : arr) {
			if (index == target) {
				return index;
			}
		}
		return Integer.MAX_VALUE;
	}

	static boolean linearSerchBool(int arr[], int target) {
		if (arr == null) {
			return false;
		}
		for (int index : arr) {
			if (index == target) {
				return true;
			}
		}
		return false;
	}
}
