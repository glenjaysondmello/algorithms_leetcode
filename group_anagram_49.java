// Use a HashMap with sorted characters as keys to group strings that are anagrams.
class group_anagram_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sortedArr = new String(charArr);

            if(!map.containsKey(sortedArr)) {
                map.put(sortedArr, new ArrayList<>());
            }

            map.get(sortedArr).add(word);
        }

        return new ArrayList<>(map.values());
    }
}

// Example 1:
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Explanation:
// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

// Example 2:
// Input: strs = [""]
// Output: [[""]]

// Example 3:
// Input: strs = ["a"]
// Output: [["a"]]


import java.util.*;

public class group_anagram_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedArray = new String(charArray);

            if (anagramsMap.containsKey(sortedArray)) {
                anagramsMap.get(sortedArray).add(word);
            } else {
                anagramsMap.put(sortedArray, new ArrayList<>(Collections.singletonList(word)));
            }
        }

        return new ArrayList<>(anagramsMap.values());
    }

    public static void main(String args[]) {
        String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        String[] strs2 = { "" };
        String[] strs3 = { "a" };

        System.out.println(groupAnagrams(strs1));
        System.out.println(groupAnagrams(strs2));
        System.out.println(groupAnagrams(strs3));
    }
}
