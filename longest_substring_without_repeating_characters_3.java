// HashSet approach: Uses a sliding window with a HashSet to ensure all characters in the window are unique by removing characters from the left when a duplicate is found.
class longest_substring_without_repeating_characters_3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;

        int n = s.length();
        int winStart = 0;
        int maxLen = Integer.MIN_VALUE;

        HashSet<Character> set = new HashSet<>();

        for(int winEnd = 0; winEnd < n; winEnd++) {
            char endChar = s.charAt(winEnd);

            while(set.contains(endChar)) {
                char startChar = s.charAt(winStart);
                set.remove(startChar);
                winStart++;
            }
            
            set.add(endChar);
            maxLen = Math.max(maxLen, set.size());
        }

        return maxLen;
    }
}

// HashMap approach: Uses a sliding window with a HashMap to track character frequencies and shrink the window until duplicates are removed, maximizing the substring length.
class longest_substring_without_repeating_characters_3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        
        int n = s.length();
        int winStart = 0;
        int maxLen = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int winEnd = 0; winEnd < n; winEnd++) {
            char endChar = s.charAt(winEnd);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            while(map.get(endChar) > 1) {
                char startChar = s.charAt(winStart);
                map.put(startChar, map.get(startChar) - 1);
                
                if(map.get(startChar) == 0) map.remove(startChar);

                winStart++;
            }

            maxLen = Math.max(maxLen, winEnd - winStart + 1);
        }

        return maxLen;
    }
}

// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

// Example 3:
// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


import java.util.*;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0, right = 0;
        Set<Character> subStr = new HashSet<>();
        while(right < n) {
            if(!subStr.contains(s.charAt(right))) {
                subStr.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                subStr.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
    public static void main(String args[]) {
        String s1 = "abcabcbb";
        String s2 = "bbbb";
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }
}
