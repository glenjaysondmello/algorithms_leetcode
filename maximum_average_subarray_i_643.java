// Uses a fixed-size sliding window by maintaining the sum of k elements and updating the maximum average in O(n) time.
class maximum_average_subarray_i_643 {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        for(int i = 0; i < k; i++) sum += nums[i];
        double maxAvg = (double) sum / k;

        for(int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, (double) sum / k);
        }

        return maxAvg;
    }
}

// Uses a sliding window that grows until size k, then slides forward while updating the window sum and maximum average.
class maximum_average_subarray_i_643 {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double windowSum = 0;
        int windowStart = 0;

        for(int i = 0; i < nums.length; i++) {
            windowSum += nums[i];

            if(i >= k - 1) {
                double avg = windowSum / k;
                maxAvg = Math.max(maxAvg, avg);

                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return maxAvg;
    }
}

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

// Example 2:

// Input: nums = [5], k = 1
// Output: 5.00000

