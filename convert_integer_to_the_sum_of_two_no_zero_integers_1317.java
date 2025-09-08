class convert_integer_to_the_sum_of_two_no_zero_integers_1317 {
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1; i < n; i++) {
            int j = n - i;

            if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")) {
                return new int[]{i, j};
            }
        }

        return new int[0];
    }
}

// Example 1:

// Input: n = 2
// Output: [1,1]
// Explanation: Let a = 1 and b = 1.
// Both a and b are no-zero integers, and a + b = 2 = n.

// Example 2:

// Input: n = 11
// Output: [2,9]
// Explanation: Let a = 2 and b = 9.
// Both a and b are no-zero integers, and a + b = 11 = n.
// Note that there are other valid answers as [8, 3] that can be accepted.

