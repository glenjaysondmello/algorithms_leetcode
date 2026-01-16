// Two-pointer sliding window approach to count subarrays whose product is less than k in O(n) time.
class subarray_product_less_than_k_713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;

        int start = 0;
        int count = 0;
        int product = 1;

        for(int end = 0; end < n; end++) {
            product *= nums[end];

            while(product >= k && start <= end) product /= nums[start++];

            count += end - start + 1;
        }

        return count;
    }
}

// Example 1:
// Input: nums = [10,5,2,6], k = 100
// Output: 8
// Explanation: The 8 subarrays that have product less than 100 are:
// [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
// Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

// Example 2:
// Input: nums = [1,2,3], k = 0
// Output: 0

