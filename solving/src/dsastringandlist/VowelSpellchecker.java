package dsastringandlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VowelSpellchecker {
//	public String[] spellchecker(String[] wordlist, String[] queries) {
//		List<String> result = new ArrayList();
//		String vowels = "aeiouAEIOU";
//		HashMap<String, Integer> map = new HashMap<>();
//		for (int i = 0; i < wordlist.length; i++) {
//			if (wordlist[i].contains(vowels)) {
//
//			}
//			map.put(wordlist[i], i);
//		}
//
//		for (int j = 0; j < queries.length; j++) {
//			if (map.containsKey(queries[j])) {
//				result.add(queries[j]);
//			} else {
//				result.add("");
//			}
//		}
//		return result.toArray(new String[0]);
//	}

	// Helper function to replace all vowels with a common character, say '*'.
	private String normalize(String word) {
		return word.replaceAll("[aeiouAEIOU]", "*");
	}

	public String[] spellchecker(String[] wordlist, String[] queries) {
		Set<String> exactMatchSet = new HashSet<>();
		Map<String, Set<String>> vowelMatchMap = new HashMap<>();

		// Build a set for exact matches and a map for vowel matches
		for (String word : wordlist) {
			exactMatchSet.add(word);
			String normalizedWord = normalize(word);
			vowelMatchMap.putIfAbsent(normalizedWord, new HashSet<>());
			vowelMatchMap.get(normalizedWord).add(word);
		}

		String[] result = new String[queries.length];

		for (int i = 0; i < queries.length; i++) {
			String query = queries[i];

			// Check for exact match first
			if (exactMatchSet.contains(query)) {
				result[i] = query;
			}
			// If no exact match, check for vowel match
			else {
				String normalizedQuery = normalize(query);
				Set<String> vowelMatches = vowelMatchMap.getOrDefault(normalizedQuery, new HashSet<>());

				// Check for a case-insensitive match of the query
				for (String match : vowelMatches) {
					if (match.equalsIgnoreCase(query)) {
						result[i] = match;
						break;
					}
				}
				// If no match is found, return an empty string
				if (result[i] == null) {
					result[i] = "";
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		VowelSpellchecker solution = new VowelSpellchecker();

		String[] wordlist = { "KiTe", "kite", "hare", "Hare" };
		String[] queries = { "kite", "Kite", "KiTe", "hAre", "Hare", "Hear" };

		String[] result = solution.spellchecker(wordlist, queries);

		System.out.println(Arrays.toString(result));
	}
}
