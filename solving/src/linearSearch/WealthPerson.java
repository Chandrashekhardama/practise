package linearSearch;

public class WealthPerson {
	public static void main(String[] args) {
		int[][] nums = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		System.out.println(maxWealth(nums));
	}

	public static int maxWealth(int[][] num) {
		int ans = Integer.MIN_VALUE;
		for (int[] n : num) {
			int sum = 0;
			for (int event : n) {
				sum = sum + event;
			}
			if (ans < sum) {
				ans = sum;
			}
		}
		return ans;
	}
}
