package dsastringandlist;

import java.util.Arrays;

public class MinimumMovesToSeat {
	//2037. Minimum Number of Moves to Seat Everyone
	/*
	 * Example where seats = [3,1,5] and students = [2,7,4].
	 * 
	 * Here, we have 3 seats and 3 students. The seats are at positions 3, 1, and 5,
	 * and the students are at positions 2, 7, and 4.
	 * 
	 * Here’s how the students are moved to the seats:
	 * 
	 * First Seat (Position 1): The closest student to this seat is the first
	 * student who is at position 2. So, this student is moved one step to the left,
	 * to position 1, where the seat is available. This requires 1 move.
	 * 
	 * Second Seat (Position 3): The closest student to this seat is now the third
	 * student who is at position 4 (since the first student has already been
	 * seated). So, this student is moved one step to the left, to position 3, where
	 * the seat is available. This requires 1 move.
	 * 
	 * Third Seat (Position 5): The only remaining student is the second student who
	 * is at position 7. So, this student is moved two steps to the left, to
	 * position 5, where the seat is available. This requires 2 moves.
	 * 
	 * So, the total number of moves used is 1 (for the first seat) + 1 (for the
	 * second seat) + 2 (for the third seat) = 4 moves.
	 */
	//95%
	private int minMovesToSeat(int[] seats, int[] students) {
		Arrays.sort(seats);
		Arrays.sort(students);
		int result = 0;
		for (int i = 0; i < seats.length; i++) {
			result +=Math.abs(seats[i] - students[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] seats = { 3, 1, 5 };
		int[] students = { 2, 7, 4 };
		MinimumMovesToSeat sol = new MinimumMovesToSeat();
		System.out.println(sol.minMovesToSeat(seats, students));
	}

}
