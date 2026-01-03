// Applies a sliding window that allows flipping at most k zeros by tracking the count of ones to maximize the length of consecutive ones.
class max_consecutive_ones_III_1004 {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxLen = Integer.MIN_VALUE;
        int winStart = 0;
        int maxOnes =  0;

        for(int winEnd = 0; winEnd < n; winEnd++) {
            if(nums[winEnd] == 1) maxOnes++;

            while((winEnd - winStart + 1 - maxOnes) > k) {
                if(nums[winStart] == 1) maxOnes--;

                winStart++;
            }

            maxLen = Math.max(maxLen, winEnd - winStart + 1);
        }

        return maxLen;
    }
}

// Example 1:
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

// Example 2:
// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

