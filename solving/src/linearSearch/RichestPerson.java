package linearSearch;

public class RichestPerson {
	public static void main(String[] args) {
		int[][] accounts = { { 2, 8, 7 }, { 2, 8, 7 }, { 1, 9, 5 } };
		System.out.println(maximumWealth(accounts));
	}

	static public int maximumWealth(int[][] accounts) {
		int ans = Integer.MIN_VALUE;
		for (int[] row : accounts) {
			int sum = 0;
			for (int col : row) {
				sum = sum + col;
			}
			if (ans < sum) {
				ans = sum;
			}
		}
		return ans;
	}
}
