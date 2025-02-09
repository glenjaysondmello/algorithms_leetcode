import java.util.*;

public class valid_anagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }

    public static void main(String args[]) {
        valid_anagram_242 sol = new valid_anagram_242();

        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println(sol.isAnagram(s1, t1));
        System.out.println(sol.isAnagram(s2, t2));
    }
}