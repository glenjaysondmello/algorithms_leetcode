// Two-pointer approach: on first mismatch, try skipping either the left or right character and check if the remaining substring is a palindrome.
class valid_palindrome_II_680 {
    public boolean validPalindrome(String s) {
        int n = s.length();
        
        int left = 0;
        int right = n - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}

// Example 1:
// Input: s = "aba"
// Output: true

// Example 2:
// Input: s = "abca"
// Output: true
// Explanation: You could delete the character 'c'.

// Example 3:
// Input: s = "abc"
// Output: false

