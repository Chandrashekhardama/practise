package binarysearch;

public class InfiniteArrSerach {
	//since its infinate array we length use not good practise 
	//thats the reason we checking chunks if not present then we 2x the size of chunk  untill we find them
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 8, 9, 34, 56, 78, 90 };
		int target = 9;
		InfiniteArrSerach sol = new InfiniteArrSerach();
		sol.ans(arr, target);//start and end handler
	}

	public void ans(int[] arr, int target) {
		int start = 0;
		int end = 1;
		if (target > arr[end]) {
			int temp = end + 1;//new start for next chunk
			end = end + (end - start + 1) * 2;//new end here +1 is initial index
			start = temp;
		}
		System.out.println(binarySearch(arr, target, start, end));
	}

	public int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
