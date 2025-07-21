class delete_characters_to_make_fancy_string_1957 {
    public String makeFancyString(String s) {
        int count = 1;
        char prev = s.charAt(0);
        StringBuilder sb = new StringBuilder("" + prev);


        for(int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);

            if(prev == cur) {
                count++;
            } else {
                count = 1;
            }

            if(count <= 2) sb.append(s.charAt(i));
            prev = cur;
        }

        return sb.toString();
    }
}


// Example 1:

// Input: s = "leeetcode"
// Output: "leetcode"
// Explanation:
// Remove an 'e' from the first group of 'e's to create "leetcode".
// No three consecutive characters are equal, so return "leetcode".
  
// Example 2:

// Input: s = "aaabaaaa"
// Output: "aabaa"
// Explanation:
// Remove an 'a' from the first group of 'a's to create "aabaaaa".
// Remove two 'a's from the second group of 'a's to create "aabaa".
// No three consecutive characters are equal, so return "aabaa".
  
// Example 3:

// Input: s = "aab"
// Output: "aab"
// Explanation: No three consecutive characters are equal, so return "aab".

