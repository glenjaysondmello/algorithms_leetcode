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
