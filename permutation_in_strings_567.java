// Uses a fixed-size sliding window with character frequency matching to detect permutation
class permutation_in_strings_567 {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length() - 1, n2 = s2.length();
        int winStart = 0;
        int matched = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int winEnd = 0; winEnd < n2; winEnd++) {
            char endChar = s2.charAt(winEnd);

            if(map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);

                if(map.get(endChar) == 0) matched++;
            }

            if(matched == map.size()) return true;

            if(winEnd >= n1) {
                char startChar = s2.charAt(winStart);

                if(map.containsKey(startChar)) {
                    if(map.get(startChar) == 0) matched--;

                    map.put(startChar, map.get(startChar) + 1);
                }

                winStart++;
            }
        }

        return false;
    }
}

// Example 1:
// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").

// Example 2:
// Input: s1 = "ab", s2 = "eidboaoo"
// Output: false


public class permutation_in_strings_567 {
    public static boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2)
            return false;
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        for (int i = 0; i < n1; i++) {
            s1Freq[s1.charAt(i) - 97]++;
        }
        for (int i = 0; i < n2; i++) {
            s2Freq[s2.charAt(i) - 97]++;
            if (i >= n1) {
                s2Freq[s2.charAt(i - n1) - 97]--;
            }
            if (arraysEquals(s1Freq, s2Freq)) {
                return true;
            }
        }
        return false;
    }

    private static boolean arraysEquals(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s1a = "ab", s2b = "eidbaooo";
        String s1c = "ab", s2d = "eidboaoo";
        System.out.println(checkInclusion(s1a, s2b));
        System.out.println(checkInclusion(s1c, s2d));
    }
}
