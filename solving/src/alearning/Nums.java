package alearning;

import java.util.Arrays;
import java.util.List;

public class Nums {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(55, 52, 56, 15, 24, 55, 31, 89);
//		output: 55,56,52

//		Integer integer = listOfIntegers.stream().distinct().sorted().findFirst().get();
//		System.out.println(integer);
		
		listOfIntegers.stream().distinct().filter(n -> n / 10 == 5).forEach(System.out::println);

		Integer max = listOfIntegers.stream().max(Integer::compareTo).get();
		System.out.println("Highest: " + max);

		Integer min = listOfIntegers.stream().min(Integer::compareTo).get();
		System.out.println("Lowest: " + min);
	}
}
