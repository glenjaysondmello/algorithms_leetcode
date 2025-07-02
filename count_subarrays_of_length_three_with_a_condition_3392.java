class count_subarrays_of_length_three_with_a_condition_3392 {
    public static int countSubarrays(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            if((nums[i] + nums[i + 2]) * 2 == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] nums1 = {1, 2, 1, 4, 1};
        int[] nums2 = {1, 1, 1};

        System.out.println(countSubarrays(nums1));
        System.out.println(countSubarrays(nums2));
    }
}


// Example 1:

// Input: nums = [1,2,1,4,1]

// Output: 1

// Explanation:

// Only the subarray [1,4,1] contains exactly 3 elements where the sum of the first and third numbers equals half the middle number.

// Example 2:

// Input: nums = [1,1,1]

// Output: 0

// Explanation:

// [1,1,1] is the only subarray of length 3. However, its first and third numbers do not add to half the middle number.

