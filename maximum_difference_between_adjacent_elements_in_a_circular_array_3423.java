class maximum_difference_between_adjacent_elements_in_a_circular_array_3423 {
    public static int maxAdjacentDistance(int[] nums) {
        int diff = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i == nums.length - 1) {
                if(Math.abs(nums[i] - nums[0]) > diff) {
                    diff = Math.abs(nums[i] - nums[0]);
                }
            } else if(Math.abs(nums[i] - nums[i + 1]) > diff) {
                diff = Math.abs(nums[i] - nums[i + 1]);
            }
        }

        return diff;
    }

    public static void main(String args[]) {
        int[] nums1 = {1, 2, 4};
        int[] nums2 = {-5, -10, -5};

        System.out.println(maxAdjacentDistance(nums1));
        System.out.println(maxAdjacentDistance(nums2));
    }
}


// Example 1:

// Input: nums = [1,2,4]

// Output: 3

// Explanation:

// Because nums is circular, nums[0] and nums[2] are adjacent. They have the maximum absolute difference of |4 - 1| = 3.

// Example 2:

// Input: nums = [-5,-10,-5]

// Output: 5

// Explanation:

// The adjacent elements nums[0] and nums[1] have the maximum absolute difference of |-5 - (-10)| = 5.


  
