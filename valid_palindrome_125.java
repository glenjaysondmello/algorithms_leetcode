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