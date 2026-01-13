// Sort the array and use a two-pointer technique to find the triplet whose sum is closest to the target in O(n^2) time.
class Three3sum_closest_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(Math.abs(sum - target) < Math.abs(closestSum - target)) closestSum = sum;

                if(sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return closestSum;
    }
}

// Example 1:
// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

// Example 2:
// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

