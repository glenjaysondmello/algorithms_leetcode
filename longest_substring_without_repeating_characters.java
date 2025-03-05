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
