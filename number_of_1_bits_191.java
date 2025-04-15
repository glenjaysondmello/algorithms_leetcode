class number_of_1_bits_191 {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static void main(String args[]) {
        int n1 = 11;
        int n2 = 128;
        int n3 = 2147483645;

        System.out.println(hammingWeight(n1));
        System.out.println(hammingWeight(n2));
        System.out.println(hammingWeight(n3));
    }
}

// Example 1:

// Input: n = 11

// Output: 3

// Explanation:

// The input binary string 1011 has a total of three set bits.

// Example 2:

// Input: n = 128

// Output: 1

// Explanation:

// The input binary string 10000000 has a total of one set bit.

// Example 3:

// Input: n = 2147483645

// Output: 30

// Explanation:

// The input binary string 1111111111111111111111111111101 has a total of thirty set bits.
