// Recursion (Recommended)
class find_the_k_th_character_in_string_game_i_3304 {
    public static char kthCharacter(int k) {
        String pro = "a";

        return process(pro, k);
    }

    static char process(String pro, int k) {
        if(pro.length() >= k) return pro.charAt(k - 1);

        StringBuilder sb = new StringBuilder(pro);

        for(int i = 0; i < pro.length(); i++) {
            sb.append((char) (pro.charAt(i) + 1));
        }

        return process(sb.toString(), k);
    }

    public static void main(String args[]) {
        int k1 = 5, k2 = 10;

        System.out.println(kthCharacter(k1));
        System.out.println(kthCharacter(k2));
    }
}

// Approach 2
class find_the_k_th_character_in_string_game_i_3304 {
    public static char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");

        return process(sb, k);
    }

    static char process(StringBuilder pro, int k) {
        while(pro.length() < k) {
            int len = pro.length();
            for(int i = 0; i < len; i++) {
                pro.append((char) (pro.charAt(i) + 1));
            }
        }

        return pro.charAt(k - 1);
    }

    public static void main(String args[]) {
        int k1 = 5, k2 = 10;

        System.out.println(kthCharacter(k1));
        System.out.println(kthCharacter(k2));
    }    
}


// Example 1:

// Input: k = 5

// Output: "b"

// Explanation:

// Initially, word = "a". We need to do the operation three times:

// Generated string is "b", word becomes "ab".
// Generated string is "bc", word becomes "abbc".
// Generated string is "bccd", word becomes "abbcbccd".
  
// Example 2:

// Input: k = 10

// Output: "c"


  
