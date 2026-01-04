//Fixed-size sliding window with character frequency map to find all starting indices of anagrams of p in s
class find_all_anagrams_in_a_string_438 {
    public List<Integer> findAnagrams(String s, String p) {
        int pLen = p.length() - 1, sLen = s.length();
        int winStart = 0;
        int matched = 0;

        List<Integer> list = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int winEnd = 0; winEnd < sLen; winEnd++) {
            char endChar = s.charAt(winEnd);

            if(map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);

                if(map.get(endChar) == 0) matched++;
            }

            if(matched == map.size()) list.add(winStart);

            if(winEnd >= pLen) {
                char startChar = s.charAt(winStart);

                if(map.containsKey(startChar)) {
                    if(map.get(startChar) == 0) matched--;

                    map.put(startChar, map.get(startChar) + 1);
                }

                winStart++;
            }
        }

        return list;
    }
}

// Example 1:
// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".

// Example 2:
// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".

