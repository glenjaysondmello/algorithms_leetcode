class calculate_money_in_leetcode_bank_1716 {
    public int totalMoney(int n) {
        int sum = 0, inc = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 7 == 0) {
                sum += 7 + inc;
                inc++;
                continue;
            }

            sum += (i % 7) + inc;
        }

        return sum;
    }
}

// Example 1:

// Input: n = 4
// Output: 10
// Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

// Example 2:

// Input: n = 10
// Output: 37
// Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.

// Example 3:

// Input: n = 20
// Output: 96
// Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.

  
