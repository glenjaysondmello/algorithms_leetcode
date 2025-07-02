class count_equal_divisible_pairs_array_2176 {
    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count += ((i * j) % k == 0) ? 1 : 0;  
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] nums1 = {3,1,2,2,2,1,3}; 
        int k1 = 2;

        int[] nums2 = {1,2,3,4};
        int k2 = 1;

        System.out.println(countPairs(nums1, k1));
        System.out.println(countPairs(nums2, k2));
    }
}

// Example 1:

// Input: nums = [3,1,2,2,2,1,3], k = 2
// Output: 4
// Explanation:
// There are 4 pairs that meet all the requirements:
// - nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
// - nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
// - nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
// - nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.

// Example 2:

// Input: nums = [1,2,3,4], k = 1
// Output: 0
// Explanation: Since no value in nums is repeated, there are no pairs (i,j) that meet all the requirements.
