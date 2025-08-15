package alearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DataCollMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
//				K,	V
		map.put("A", 1);
		map.put("C", 2);
		map.put(null, 3);
		map.put(null, 4);
		map.put("D", null);
		map.put("E", 5);

//		System.out.println("get by key: " + map.get("C"));
//		System.out.println("get by key where key is NULL: " + map.get(null)); //will always return the last value having null value
//		map.remove("D");//remove by key
//		System.out.println(map.containsKey("A"));	//return bool
//		System.out.println(map.containsValue(2)); 	// return bool\

//		loop printing
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + "=" + entry.getValue());
//		}

		// lamda foreach
//		map.forEach((key, val) -> System.out.println(key + ":" + val));

		// concutrrent hashmap
		Map<String, Integer> ccmap = new ConcurrentHashMap<>();
//		ccmap.put(null, 1);//nullpoint error in runtime
		ccmap.put("A", 1);
        ccmap.put("B", 2);
		for (Map.Entry<String, Integer> maps : ccmap.entrySet()) {
			System.out.println(maps.getKey() + "=" + maps.getValue());
		}
		
		/*
		 * Map<K, V> stores key–value pairs.
		 * Keys are unique, but values can be duplicate.
		 * Common implementations:
		 * HashMap → Fast, unordered, allows null key and values.
		 * LinkedHashMap → Maintains insertion order.
		 * TreeMap → Sorted by keys (natural order or custom comparator).
		 * ConcurrentHashMap → Thread-safe.
		 */
	}
}
