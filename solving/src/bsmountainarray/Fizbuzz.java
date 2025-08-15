package bsmountainarray;

public class Fizbuzz {
	//https://medium.com/@danilosimiyu/fizz-buzz-challenge-in-java-for-beginners-6808a07f83ca
	public static void main(String[] args) {
		int n = 15;
		fizbuzzLogic(n);
	}

	public static void fizbuzzLogic(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				}
			} else {
				System.out.println(i);
			}
		}

	}

}
