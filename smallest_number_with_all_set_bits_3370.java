class smallest_number_with_all_set_bits_3370 {
    public int smallestNumber(int n) {
        while((n & (n + 1)) != 0) {
            n |= (n + 1);
        }

        return n;
    }
}

// Example 1:

// Input: n = 5
// Output: 7
// Explanation:
// The binary representation of 7 is "111".

// Example 2:

// Input: n = 10
// Output: 15
// Explanation:
// The binary representation of 15 is "1111".

// Example 3:

// Input: n = 3
// Output: 3
// Explanation:
// The binary representation of 3 is "11".

