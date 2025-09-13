// without isVowel function
class find_most_frequent_vowel_and_consonent_3541 {
    public int maxFreqSum(String s) {
        int maxV = 0;
        int maxC = 0;
      
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: freq.entrySet()) {
            char key = entry.getKey();
            if(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') {
                maxV = Math.max(maxV, entry.getValue());
            } else {
                maxC = Math.max(maxC, entry.getValue());
            }
        }

        return maxV + maxC;
    }
}

// with isVowel function
class find_most_frequent_vowel_and_consonent_3541 {
    public int maxFreqSum(String s) {
        int maxV = 0;
        int maxC = 0;
      
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: freq.entrySet()) {
            if(isVowel(entry.getKey())) {
                maxV = Math.max(maxV, entry.getValue());
            } else {
                maxC = Math.max(maxC, entry.getValue());
            }
        }

        return maxV + maxC;
    }

    static boolean isVowel(int target) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        for(char ch : arr) {
            if(ch == target) return true;
        }

        return false;
    }
}

// Example 1:

// Input: s = "successes"
// Output: 6
// Explanation:
// The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
// The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
// The output is 2 + 4 = 6.
  
// Example 2:

// Input: s = "aeiaeia"
// Output: 3
// Explanation:
// The vowels are: 'a' (frequency 3), 'e' ( frequency 2), 'i' (frequency 2). The maximum frequency is 3.
// There are no consonants in s. Hence, maximum consonant frequency = 0.
// The output is 3 + 0 = 3.

