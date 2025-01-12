package dsastringandlist;

public class LeanerSearchPra {

	public static void main(String[] args) {
//		int[] arr = { 4, 10, 5, 6, 9, 2 };
//		int target = 5;
//		System.out.println(searchIndex(target, arr));
		String str = "shekhar";
		char target = 'e';
		System.out.println(serchChar(str, target));
	}

	static boolean serchChar(String str, char target) {
		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}
		}

		return false;
	}

//	static int searchIndex(int target, int[] arr) {
//		// -- for index return
////		for (int index = 0; index < arr.length - 1; index++) {
////			if (arr[index] == target) {
////				return arr[index];
////			}
////		}
//
//		// -- for value return
//		for (int result : arr) {
//			if (result == target) {
//				return result;
//			}
//		}
//		return Integer.MAX_VALUE;
//	}
}
