package alearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestFindFirstName {
	public static void main(String[] args) {

		// return name having same fname
		List<String[]> names = Arrays.asList(
				new String[] { "John", "cena" }, 
				new String[] { "John", "son" },
				new String[] { "mick", "son" }, 
				new String[] { "John", "wick" });

		Map<String, List<String>> namesMap = new HashMap<>();
		for (String[] parts : names) {
			String fname = parts[0];
			String lname = parts[1];

			namesMap.computeIfAbsent(fname, k -> new ArrayList<>()).add(lname);
		}

		for (Map.Entry<String, List<String>> entry : namesMap.entrySet()) {
			if (entry.getValue().size() > 1) {
				for (String value : entry.getValue()) {
					System.out.println(entry.getKey() + " " + value);
				}
			}
		}
	}
}
