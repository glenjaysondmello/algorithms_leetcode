// Uses a sliding window while tracking the most frequent character to ensure at most k replacements are needed, maximizing the length of a repeating-character substring.
class longest_repeating_character_replacement_424 {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int winStart = 0;
        int maxRepeated = Integer.MIN_VALUE;
        int maxLen = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int winEnd = 0; winEnd < n; winEnd++) {
            char ch = s.charAt(winEnd);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxRepeated = Math.max(maxRepeated, map.get(ch));

            if((winEnd - winStart + 1 - maxRepeated) > k) {
                char curr = s.charAt(winStart);
                map.put(curr, map.get(curr) - 1);

                if(map.get(curr) == 0) map.remove(curr);

                winStart++;
            }

            maxLen = Math.max(maxLen, winEnd - winStart + 1);
        }

        return maxLen;
    }
}

// Example 1:
// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.

// Example 2:
// Input: s = "AABABBA", k = 1
// Output: 4
// Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
// The substring "BBBB" has the longest repeating letters, which is 4.
// There may exists other ways to achieve this answer too.


import java.util.*;

class longest_repeating_character_replacement_424 {
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxRepeatChar = 0;
        int maxLength = 0;
        int noRepeatChar;
        Map<Character, Integer> freqMap = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            freqMap.put(currChar, freqMap.getOrDefault(currChar, 0) + 1);
            maxRepeatChar = Math.max(maxRepeatChar, freqMap.get(currChar));
            noRepeatChar = (right - left + 1) - maxRepeatChar;
            
            if(noRepeatChar > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar)-1);
                left++;
            }
            maxLength = Math.max(maxLength, (right - left + 1));
        }
        return maxLength;
    }
    public static void main(String args[]) {
        String s1 = "ABAB";
        int k1 = 2;
        String s2 = "AABABBA";
        int k2 = 1;
        System.out.println(characterReplacement(s1, k1));
        System.out.println(characterReplacement(s2, k2));
    }
}
