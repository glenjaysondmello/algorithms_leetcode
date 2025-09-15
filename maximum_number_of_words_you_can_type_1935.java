class maximum_number_of_words_you_can_type_1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] words = text.split(" ");

        for(String word : words) {
            boolean canType = true;

            for(char ch : brokenLetters.toCharArray()) {
                if(word.indexOf(ch) != -1) {
                    canType = false;
                    break;
                }
            }

            if(canType) count++;
        }

        return count;
    }
}

// Example 1:

// Input: text = "hello world", brokenLetters = "ad"
// Output: 1
// Explanation: We cannot type "world" because the 'd' key is broken.

// Example 2:

// Input: text = "leet code", brokenLetters = "lt"
// Output: 1
// Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.

// Example 3:

// Input: text = "leet code", brokenLetters = "e"
// Output: 0
// Explanation: We cannot type either word because the 'e' key is broken.


  
