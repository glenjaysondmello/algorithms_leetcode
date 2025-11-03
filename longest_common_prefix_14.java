// Approach 1: Use indexOf() to check if the current string starts with the prefix and shorten it until it matches. 
class longest_common_prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()) return prefix;
            }
        }

        return prefix;
    }
}

// Approach 2: Use startsWith() to directly check prefix match and trim until a common prefix is found.
class longest_common_prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()) return prefix;
            }
        }

        return prefix;
    }
}

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

