// Approach 1: Space-optimized DP using two variables (prev1, prev2) to track max sums.
class house_robber_198 {
    public int rob(int[] nums) {
        int n = nums.length;

        int prev1 = nums[0];
        int prev2 = 0;

        for(int i = 1; i < n; i++) {
            int pick = nums[i];

            if(i > 1) pick += prev2;
            
            int notPick = prev1;

            int curr = Math.max(pick, notPick);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

// Approach 2: Tabulation DP using an array to store optimal results at each index.
class house_robber_198 {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = nums[0];

        for(int i = 1; i < n; i++) {
            int pick = nums[i];

            if(i > 1) pick += dp[i - 2];
            
            int notPick = dp[i - 1];

            dp[i] = Math.max(pick, notPick);
        }

        return dp[n - 1];
    }
}

// Approach 3: Top-down DP with memoization to avoid recomputation.
class house_robber_198 {
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length];

        return helper(nums, 0, dp);
    }

    static int helper(int[] nums, int i, Integer[] dp) {
        if(i >= nums.length) return 0;

        if(dp[i] != null) return dp[i];

        int pick = nums[i] + helper(nums, i + 2, dp);
        int notPick = 0 + helper(nums, i + 1, dp);

        return dp[i] = Math.max(pick, notPick);
    }
}

// Approach 4: Pure recursion without memoization, exponential time complexity.
class Solution {
    public int rob(int[] nums) {
        return helper(nums, 0);
    }

    static int helper(int[] nums, int i) {
        if(i >= nums.length) return 0;

        int pick = nums[i] + helper(nums, i + 2);
        int notPick = 0 + helper(nums, i + 1);

        return Math.max(pick, notPick);
    }
}

// Example 1:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.

// Example 2:

// Input: nums = [2,7,9,3,1]
// Output: 12
// Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
// Total amount you can rob = 2 + 9 + 1 = 12.

