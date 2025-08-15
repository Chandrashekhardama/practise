package alearning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DataCollSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("S");
		set.add("D");
		set.add("C");
		set.add("Z");// duplicate ignored in print
		System.out.println(set);
//		add(E e)               // Adds an element
//		remove(Object o)       // Removes an element
//		contains(Object o)     // Checks if element exists
//		size()                 // Number of elements
//		isEmpty()              // Checks if empty
//		clear()                // Removes all elements
//		addAll(Collection c)   // Adds all elements from another collection
//		removeAll(Collection c)// Removes matching elements
//		retainAll(Collection c)// Keeps only matching elements
//		forEach(Consumer c)    // Iterates using lambda

		// 2.LinkedHashSet
		Set<String> linkedset = new LinkedHashSet<>();
		linkedset.add("AAAA");
		linkedset.add("BBB");
		linkedset.add("DDD");
		System.out.println(linkedset);// prints in same orrder

		// 3.TreeSet
		Set<String> treeset = new TreeSet<>();
		treeset.add("DDD");
		treeset.add("BBB");
		treeset.add("AAAA");
		System.out.println(treeset);// always sorted

	}

}
