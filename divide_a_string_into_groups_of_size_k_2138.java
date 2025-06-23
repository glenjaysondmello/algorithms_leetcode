class divide_a_string_into_groups_of_size_k_2138 {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> arr = new ArrayList<>();
        int i = 0;

        while(i < s.length()) {
            String str = s.substring(i, Math.min(i + k, s.length()));
            int len = str.length();
            StringBuilder sb = new StringBuilder(str);

            while(sb.length() < k) {
                sb.append(fill);
            }

            arr.add(sb.toString());

            i += k;
        }

        return arr.toArray(new String[0]);
    }
}



// Example 1:

// Input: s = "abcdefghi", k = 3, fill = "x"
// Output: ["abc","def","ghi"]
// Explanation:
// The first 3 characters "abc" form the first group.
// The next 3 characters "def" form the second group.
// The last 3 characters "ghi" form the third group.
// Since all groups can be completely filled by characters from the string, we do not need to use fill.
// Thus, the groups formed are "abc", "def", and "ghi".
  
// Example 2:

// Input: s = "abcdefghij", k = 3, fill = "x"
// Output: ["abc","def","ghi","jxx"]
// Explanation:
// Similar to the previous example, we are forming the first three groups "abc", "def", and "ghi".
// For the last group, we can only use the character 'j' from the string. To complete this group, we add 'x' twice.
// Thus, the 4 groups formed are "abc", "def", "ghi", and "jxx".


