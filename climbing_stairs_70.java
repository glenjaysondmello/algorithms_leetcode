// Approach 1: Space optimized DP using two variables (Fibonacci-like iteration).
class climbing_stairs_70 {
    public int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 0;

        for(int i = 1; i <= n; i++) {
            int first = prev1;
            int second = prev2;

            int curr = first + second;
            prev2 = prev1;
            prev1 = curr; 
        }

        return prev1;
    }
}

// Approach 2: Bottom-up DP using array to store results for each step.
class climbing_stairs_70 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;

        for(int i = 1; i <= n; i++) {
            int first = dp[i - 1];
            int second = 0;

            if(i > 1) second = dp[i - 2];

            dp[i] = first + second; 
        }

        return dp[n];
    }
}

// Approach 3: Top-down Memoization (recursion + caching to avoid recomputation).
class climbing_stairs_70 {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n + 1];

        return helper(n, dp);
    }

    static int helper(int n, Integer[] dp) {
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(dp[n] != null) return dp[n];

        return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
    }
}

// Approach 4: Naive recursion without memoization (exponential time).
class Solution {
    public int climbStairs(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step

