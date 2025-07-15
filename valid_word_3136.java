// (Normal character checking approach) Recommended
class valid_word_3136 {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;

        boolean hasVowel = false, hasConsonant = false;

        for(char ch : word.toCharArray()) {
            if(!Character.isLetterOrDigit(ch)) return false;

            if(isVowel(ch)) {
                hasVowel = true;
            } else if(Character.isLetter(ch)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c =='e' || c =='i' || c == 'o' || c == 'u') return true;

        return false;
    }
}

// (Regex)
class valid_word_3136 {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;

        if(!word.matches("^[a-zA-Z0-9]+$")) return false;

        if(!word.matches("(?i).*[aeiou].*")) return false;

        if(!word.matches("(?i).*[b-df-hj-np-tv-z].*")) return false;

        return true;
    }
}


// Example 1:

// Input: word = "234Adas"

// Output: true

// Explanation:

// This word satisfies the conditions.

// Example 2:

// Input: word = "b3"

// Output: false

// Explanation:

// The length of this word is fewer than 3, and does not have a vowel.

// Example 3:

// Input: word = "a3$e"

// Output: false

// Explanation:

// This word contains a '$' character and does not have a consonant.

