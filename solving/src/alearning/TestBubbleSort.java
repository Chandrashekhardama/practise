package alearning;

public class TestBubbleSort {

	public static void main(String[] args) {
		// bubble sort
		int[] arr = { 6, 2, 3, 5, 9, 7, 1 };
		int[] sortArr = sort(arr);
		for (int ar : sortArr) {
			System.out.print(ar + ","); //1,2,3,5,6,7,9,
		}
	}

	public static int[] sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			boolean swaped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) { // swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaped = true;
				}
			}
			if (!swaped) {
				break;
			}
		}

		return arr;
	}

}
