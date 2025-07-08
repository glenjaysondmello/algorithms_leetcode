class happy_number_202 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = squaresOfDigits(slow);
            fast = squaresOfDigits(squaresOfDigits(fast));
        } while (fast != slow);

        if(slow == 1) return true;

        return false;
    }

    static int squaresOfDigits(int n) {
        if (n == 1) return n;

        int res = 0;

        while(n > 0) {
            int rem = n % 10;
            res += rem * rem;
            n /= 10;
        }

        return res;
    }
}


// Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
  
// Example 2:

// Input: n = 2
// Output: false

