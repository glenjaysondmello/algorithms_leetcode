// Memoization approach: Uses DP caching to avoid repeated recursive calls, improving efficiency.
class jump_game_55 {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];

        return helper(nums, 0, dp);
    }

    static boolean helper(int[] nums, int i, Boolean[] dp) {
        if(i == nums.length - 1) return true;
        if(i >= nums.length) return false;

        if(dp[i] != null) return dp[i];

        int k = nums[i];

        while(k > 0) {
            if(helper(nums, i + k, dp)) {
                dp[i] = true;
                return true;
            }

            k--;
        }

        dp[i] = false;
        return false;
    }
}

// Pure recursion approach: Explores all possible jumps without storing results, causing exponential time.
class jump_game_55 {
    public boolean canJump(int[] nums) {
        return helper(nums, 0);
    }

    static boolean helper(int[] nums, int i) {
        if(i == nums.length - 1) {
            return true;
        } else if(i > nums.length - 1) {
            return false;
        }

        int k = nums[i];
        boolean check = false;

        while(k > 0) {
            check |= helper(nums, i + k);
            k--;
        }

        return check;
    }
}

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

// Example 2:

// Input: nums = [3,2,1,0,4]
// Output: false
// Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

