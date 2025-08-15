package alearning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataCollList {

	public static void main(String[] args) {
		// array LIST
		List<String> list = new ArrayList<>();
		list.add("V");
		list.add("b");
		list.add(2, "D"); // add at index, added in middle remaning elements will move to next indies
//		list.addAll(list);// add all
//		list.clear();// clear
//		System.out.println(list.get(2));//get
//		System.out.println(list.indexOf("B")); //index of element
//		list.set(1, "C");//update for index
//		list.remove("D"); //remove element
//		list.remove(2);  //remove index
//		list.removeIf(a -> a.equals("A"));//lamda exp
//		list.sort(Comparator.naturalOrder()); //sort
		list.replaceAll(String::toUpperCase);
		System.out.println(list);
		
//		Extra Operations Specific to LinkedList ----
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Y");
		
//		| Operation Type                   | ArrayList               | LinkedList                 |
//		| -------------------------------- | ----------------------- | -------------------------- |
//		| Random access (get/set by index) | ✅ Fast (O(1))           | ❌ Slow (O(n))              |
//		| Insert/remove at end             | ✅ Fast (O(1) amortized) | ✅ Fast (O(1))              |
//		| Insert/remove at middle          | ❌ Slow (O(n))           | ✅ Faster if node ref known |
//		| Insert/remove at beginning       | ❌ Slow (O(n))           | ✅ Fast (O(1))              |
//		| Extra queue/stack methods        | ❌ No                    | ✅ Yes                      |

	}

}
