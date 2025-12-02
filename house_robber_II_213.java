// Approach 1: Space-optimized DP using two variables to solve House Robber linearly on two subarrays excluding first and last.
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] arr1 = new int[nums.length - 1];
        int[] arr2 = new int[nums.length - 1];

        for(int i = 0; i < n; i++) {
            if(i > 0) arr1[i - 1] = nums[i];
            if(i < n - 1) arr2[i] = nums[i];
        }

        return Math.max(helper(arr1), helper(arr2));
    }

    public int helper(int[] nums) {
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

// Approach 2: Bottom-up DP using an integer dp[] array to compute max rob value for two linear arrays.
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] arr1 = new int[nums.length - 1];
        int[] arr2 = new int[nums.length - 1];

        for(int i = 0; i < n; i++) {
            if(i > 0) arr1[i - 1] = nums[i];
            if(i < n - 1) arr2[i] = nums[i];
        }

        return Math.max(helper(arr1), helper(arr2));
    }

    public int helper(int[] nums) {
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

// Approach 3: Top-down recursion with memoization using Integer[] dp to store computed results separately for each case.
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] arr1 = new int[nums.length - 1];
        int[] arr2 = new int[nums.length - 1];

        for(int i = 0; i < n; i++) {
            if(i > 0) arr1[i - 1] = nums[i];
            if(i < n - 1) arr2[i] = nums[i];
        }

        int helper1 = helper(arr1, 0, new Integer[arr1.length]);
        int helper2 = helper(arr2, 0, new Integer[arr2.length]);

        return Math.max(helper1, helper2);
    }

    static int helper(int[] nums, int i, Integer[] dp) {
        if(i >= nums.length) return 0;

        if(dp[i] != null) return dp[i];

        int pick = nums[i] + helper(nums, i + 2, dp);
        int notPick = 0 + helper(nums, i + 1, dp);

        return dp[i] = Math.max(pick, notPick);
    }
}

// Approach 4: Top-down memoized recursion using int[] dp initialized with -1 to avoid recomputation for two independent arrays.
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int[] arr1 = new int[nums.length - 1];
        int[] arr2 = new int[nums.length - 1];

        for(int i = 0; i < n; i++) {
            if(i > 0) arr1[i - 1] = nums[i];
            if(i < n - 1) arr2[i] = nums[i];
        }

        int helper1 = helper(arr1, 0, dp1);
        int helper2 = helper(arr2, 0, dp2);

        return Math.max(helper1, helper2);
    }

    static int helper(int[] nums, int i, int[] dp) {
        if(i >= nums.length) return 0;

        if(dp[i] != -1) return dp[i];

        int pick = nums[i] + helper(nums, i + 2, dp);
        int notPick = 0 + helper(nums, i + 1, dp);

        return dp[i] = Math.max(pick, notPick);
    }
}

// Example 1:

// Input: nums = [2,3,2]
// Output: 3
// Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

// Example 2:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.

// Example 3:

// Input: nums = [1,2,3]
// Output: 3

