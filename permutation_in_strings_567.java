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
