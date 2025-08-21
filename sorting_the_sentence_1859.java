// Recommended
class sorting_the_sentence_1859 {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        String[] sorted = new String[words.length];

        for(String word : words) {
            int index = word.charAt(word.length() - 1) - '0';
            sorted[index - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", sorted);
    }
}

// Not recommended
class sorting_the_sentence_1859 {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];
        int start = 0;
        int end = -1;

        for(char ch : s.toCharArray()) {
            int ind = ch - '0';
            end++;

            if(ind >= 0 && ind <= 9) {
                arr[ind - 1] = s.substring(start, end);
                start = end + 2;
            }
        }

        String str = arr[0];

        for(int i = 1; i < arr.length; i++) {
            str = str + " " + arr[i]; 
        }

        return str;
    }
}


// Example 1:

// Input: s = "is2 sentence4 This1 a3"
// Output: "This is a sentence"
// Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

// Example 2:

// Input: s = "Myself2 Me1 I4 and3"
// Output: "Me Myself and I"
// Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.

