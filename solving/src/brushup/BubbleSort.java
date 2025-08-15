package brushup;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 6, 2, 4, 3, 8, 1, 5, 9 };
		int[] sort = sort(arr);

		System.out.println("sorted arr: ");

		for (int i : sort) {
			System.out.print(i + ", ");
		}

	}

	public static int[] sort(int arr[]) {
		int n = arr.length;
		boolean swaped;
		for (int i = 0; i < n - 1; i++) {
			swaped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaped = true;
				}

			}
			// if no swap in this paas, array is sorted
			if (!swaped) {
				break;
			}
		}
		return arr;

	}
}
