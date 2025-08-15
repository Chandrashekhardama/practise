package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(6, 8, 5, 9, 10, 5, 8);
		// print
//		Stream<Integer> stream = nums.stream();
//		stream.forEach(System.out::print);
		// 2.sort
//		Stream<Integer> sorted = nums.stream().sorted();
//		sorted.forEach(System.out::print);

		// count
//		System.out.println(nums.stream().count());

		// fillers
//		List<Integer> collect = nums.stream().filter(n -> n == 5).distinct().collect(Collectors.toList());
//		System.out.println(collect);

		// distinct
//		List<Integer> collect = nums.stream()
//									.sorted()
//									.distinct()
//									.collect(Collectors.toList());
//		System.out.println(collect);

		// string sorted
		List<String> names = Arrays.asList("Shekhar", "Cd", "Dama", "Csd");
//		List<String> collect2 = names.stream().sorted().collect(Collectors.toList());
//		System.out.println(collect2);

//		List<String> collect = names.stream()
//									.map(String::toUpperCase)
//									.sorted()
//									.collect(Collectors.toList());
//		System.out.println(collect);

		// match
//		boolean anyMatch = names.stream().anyMatch(n->n.startsWith("D"));
//		System.out.println(anyMatch);

		// first word
//		Optional<String> findFirst = names.stream().findFirst();
//		String string = findFirst.get();
//		System.out.println(string);

		//Putting It All Together
		List<String> allOpn = names.stream()
									.filter(n -> n.length() > 3)
									.map(String::toUpperCase)
									.sorted()
									.distinct()
									.collect(Collectors.toList());
		System.out.println(allOpn);

	}

}
