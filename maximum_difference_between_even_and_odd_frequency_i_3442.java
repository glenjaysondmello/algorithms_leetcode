class maximum_difference_between_even_and_odd_frequency_i_3442 {
    public static int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        int diff = Integer.MIN_VALUE;

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Integer value : map.values()) {
            if(value % 2 == 0) {
                evenList.add(value);
            } else {
                oddList.add(value);
            }
        }

        for(int odd : oddList) {
            for(int even : evenList) {
                diff = Math.max(diff, (odd - even));
            }
        }

        return diff;
    }

    public static void main(String args[]) {
        String s1 = "aaaaabbc", s2 = "abcabcab";

        System.out.println(maxDifference(s1));
        System.out.println(maxDifference(s2));
    }
}


// Example 1:

// Input: s = "aaaaabbc"

// Output: 3

// Explanation:

// The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
// The maximum difference is 5 - 2 = 3.
  
// Example 2:

// Input: s = "abcabcab"

// Output: 1

// Explanation:

// The character 'a' has an odd frequency of 3, and 'c' has an even frequency of 2.
// The maximum difference is 3 - 2 = 1.


