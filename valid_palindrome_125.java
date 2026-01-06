// Two-pointer approach: compare alphanumeric characters from both ends while skipping non-alphanumerics and ignoring case.
class valid_palindrome_125 {
    public boolean isPalindrome(String s) {
        int n = s.length();

        int left = 0;
        int right = n - 1;

        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)) left++;
            else if(!Character.isLetterOrDigit(rightChar)) right--;
            else {
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) return false;

                left++;
                right--;
            }
        }

        return true;
    }
}

// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// Example 3:
// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.


public class valid_palindrome_125 {
    public static boolean isPalindrome(String s) {
        String cleanedS = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String sBuild = new StringBuilder(cleanedS).reverse().toString();
        return cleanedS.equals(sBuild);
    }

    public static void main(String args[]) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }
}
