package dsastringandlist;

import java.util.*;

public class VowelSpellchecker {
    // 966. Vowel Spellchecker
	public String[] spellchecker(String[] wordlist, String[] queries) {
        Map<String, String> exactMatchMap = new HashMap<>();
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        Map<String, String> vowelMatchMap = new HashMap<>();

        // Populate the maps
        for (String word : wordlist) {
            exactMatchMap.putIfAbsent(word, word);
            caseInsensitiveMap.putIfAbsent(word.toLowerCase(), word);
            vowelMatchMap.putIfAbsent(normalize(word), word);
        }

        String[] result = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            // Exact match
            if (exactMatchMap.containsKey(query)) {
                result[i] = query;
            } 
            // Case-insensitive match
            else if (caseInsensitiveMap.containsKey(query.toLowerCase())) {
                result[i] = caseInsensitiveMap.get(query.toLowerCase());
            } 
            // Vowel match
            else {
                result[i] = vowelMatchMap.getOrDefault(normalize(query), "");
            }
        }

        return result;
    }

    // Optimize normalize method using StringBuilder for better performance
    private String normalize(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        VowelSpellchecker solution = new VowelSpellchecker();

        String[] wordlist = { "KiTe", "kite", "hare", "Hare" };
        String[] queries = { "kite", "Kite", "KiTe", "hAre", "Hare", "Hear" };

        String[] result = solution.spellchecker(wordlist, queries);

        System.out.println(Arrays.toString(result));
    }
}
