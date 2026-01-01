// Uses a variable-size sliding window that expands to meet the target sum and shrinks to find the minimum-length subarray in O(n) time.
class minimum_size_subarray_sum_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int winSum = 0;
        int winStart = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            winSum += nums[i];

            while(winSum >= target) {
                minLen = Math.min(minLen, i - winStart + 1);
                winSum -= nums[winStart];
                winStart++;
            }
        }

        if(minLen == Integer.MAX_VALUE) return 0;

        return minLen;
    }
}

// Example 1:
// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
  
// Example 2:
// Input: target = 4, nums = [1,4,4]
// Output: 1

// Example 3:
// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0

