// Uses a sliding window with a frequency map of t to expand and shrink the window until all required characters are matched, tracking the minimum valid substring.
class minimum_window_substring_76 {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        int matched = 0;
        int winStart = 0;
        int subStrStart = 0;
        int minLen = Integer.MAX_VALUE;

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : t.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);

        for(int winEnd = 0; winEnd < sLen; winEnd++) {
            char endChar = s.charAt(winEnd);

            if(map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);

                if(map.get(endChar) == 0) matched++;
            }

            while(matched == map.size()) {
                int winSize = winEnd - winStart + 1;

                if(minLen > winSize) {
                    minLen = winSize;
                    subStrStart = winStart;
                }

                char startChar = s.charAt(winStart);

                if(map.containsKey(startChar)) {
                    if(map.get(startChar) == 0) matched--;

                    map.put(startChar, map.get(startChar) + 1);
                }

                winStart++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" 
            : s.substring(subStrStart, subStrStart + minLen);
    }
}

// Example 1:
// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

// Example 2:
// Input: s = "a", t = "a"
// Output: "a"
// Explanation: The entire string s is the minimum window.

// Example 3:
// Input: s = "a", t = "aa"
// Output: ""
// Explanation: Both 'a's from t must be included in the window.
// Since the largest window of s only has one 'a', return empty string.

