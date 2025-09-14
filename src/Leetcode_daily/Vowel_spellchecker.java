package Leetcode_daily;

import java.util.*;

//https://leetcode.com/problems/vowel-spellchecker/description/?envType=daily-question&envId=2025-09-14
public class Vowel_spellchecker {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        Map<String, String> vowelMaskMap = new HashMap<>();

        for (String word : wordlist) {
            String lower = word.toLowerCase();
            String masked = maskVowels(lower);


            caseInsensitiveMap.putIfAbsent(lower, word);


            vowelMaskMap.putIfAbsent(masked, word);
        }


        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            if (exactWords.contains(query)) {

                result[i] = query;
            } else {
                String lowerQuery = query.toLowerCase();
                String maskedQuery = maskVowels(lowerQuery);

                if (caseInsensitiveMap.containsKey(lowerQuery)) {
                    // Case-insensitive match
                    result[i] = caseInsensitiveMap.get(lowerQuery);
                } else if (vowelMaskMap.containsKey(maskedQuery)) {
                    // Vowel replacement match
                    result[i] = vowelMaskMap.get(maskedQuery);
                } else {
                    // No match
                    result[i] = "";
                }
            }
        }

        return result;
    }

    private String maskVowels(String word) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                sb.append('*');
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();


    }
}
