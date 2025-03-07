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
