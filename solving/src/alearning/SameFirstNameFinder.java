package alearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameFirstNameFinder {
	public static void main(String[] args) {
		List<String[]> ppls = Arrays.asList(new String[] { "John", "cena" }, new String[] { "John", "abraham" },
				new String[] { "mike", "hatson" }, new String[] { "John", "Wick" });

		Map<String, List<String>> nameMap = new HashMap<>();

		for (String[] ppl : ppls) {
			String fname = ppl[0];
			String lname = ppl[1];
			nameMap.computeIfAbsent(fname, k -> new ArrayList<>()).add(lname);
		}

		for (Map.Entry<String, List<String>> entry : nameMap.entrySet()) {
			if (entry.getValue().size() > 1) {
				for (String val : entry.getValue()) {
					System.out.println(entry.getKey() + " " + val);
				}
			}
		}
	}

}
