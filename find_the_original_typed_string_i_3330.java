class find_the_original_typed_string_i_3330 {
    public static int possibleStringCount(String word) {
        int count = 0;
        char prevC = word.charAt(0);

        for(int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(ch == prevC) {
                count++;
            } else {
                prevC = ch;
            }
        }

        return count + 1;
    }

    public static void main(String args[]) {
        String word1 = "abbcccc";
        String word2 = "abcd";
        String word3 = "aaaa";

        System.out.println(possibleStringCount(word1));
        System.out.println(possibleStringCount(word2));
        System.out.println(possibleStringCount(word3));
    }
}



// Example 1:

// Input: word = "abbcccc"

// Output: 5

// Explanation:

// The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".

// Example 2:

// Input: word = "abcd"

// Output: 1

// Explanation:

// The only possible string is "abcd".

// Example 3:

// Input: word = "aaaa"

// Output: 4

  

