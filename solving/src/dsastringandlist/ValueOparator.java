package dsastringandlist;

public class ValueOparator {

//	2011. Final Value of Variable After Performing Operations
	/*
	 * There is a programming language with only four operations and one variable X:
	 * 
	 * ++X and X++ increments the value of the variable X by 1. --X and X--
	 * decrements the value of the variable X by 1. Initially, the value of X is 0.
	 * 
	 * Given an array of strings operations containing a list of operations, return
	 * the final value of X after performing all the operations.
	 */
	public int finalValueAfterOperations(String[] operations) {
		int x = 0;
		if (operations == null && operations.length == 0) {
			return x;
		}

		for (String operation : operations) {
			if (operation.equals("++X") || operation.equals("X++")) {
				x++;
			} else if (operation.equals("X--") || operation.equals("--X")) {
				x--;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		ValueOparator solution = new ValueOparator();
        String[] operations = {"--X", "X++", "X++", "++X", "--X"};
        int finalValue = solution.finalValueAfterOperations(operations);
        System.out.println("Final value of X: " + finalValue);
    }
}
