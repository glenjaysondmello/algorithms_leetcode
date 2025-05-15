class first_and_last_position_of_element_in_sorted_array {
    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> st = new ArrayList<>();
        int n = groups.length;
        int lastGroup = -1;
       
        for(int i = 0; i < n; i++) {
            if(groups[i] != lastGroup) {
                st.add(words[i]);
                lastGroup = groups[i];
            }
        }

        return st;
    }

    public static void main(String args[]) {
        String[] words1 = {"e","a","b"};
        String[] words2 = {"a","b","c","d"};
        int[] groups1 = {0,0,1};
        int[] groups2 = {1,0,1,1};

        System.out.println(getLongestSubsequence(words1, groups1));
        System.out.println(getLongestSubsequence(words2, groups2));
    }
}


// Example 1:

// Input: words = ["e","a","b"], groups = [0,0,1]

// Output: ["e","b"]

// Explanation: A subsequence that can be selected is ["e","b"] because groups[0] != groups[2]. Another subsequence that can be selected is ["a","b"] because groups[1] != groups[2]. It can be demonstrated that the length of the longest subsequence of indices that satisfies the condition is 2.

// Example 2:

// Input: words = ["a","b","c","d"], groups = [1,0,1,1]

// Output: ["a","b","c"]

// Explanation: A subsequence that can be selected is ["a","b","c"] because groups[0] != groups[1] and groups[1] != groups[2]. Another subsequence that can be selected is ["a","b","d"] because groups[0] != groups[1] and groups[1] != groups[3]. It can be shown that the length of the longest subsequence of indices that satisfies the condition is 3.

 
