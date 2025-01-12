package com.app.others;

public class PrimeFactor {

	public static void main(String[] args) {
		int num = 24;
		int primeFactor = getPrimeFactor(num);
		System.out.println("primeFactor:" + primeFactor);
	}

	private static int getPrimeFactor(int num) {
		int result = 0;
		for (int i = 2; i < num; i++) {
			while (num % i == 0) {
				result = result + i;
				num = num / i;
			}
		}
		return result;
	}

}
