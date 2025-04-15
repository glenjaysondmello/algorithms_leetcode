class single_number_136 {
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for(int num : nums) {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String args[]) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));
    }
}

// Example 1:

// Input: nums = [2,2,1]

// Output: 1

// Example 2:

// Input: nums = [4,1,2,1,2]

// Output: 4

// Example 3:

// Input: nums = [1]

// Output: 1
