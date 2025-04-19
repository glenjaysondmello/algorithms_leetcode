class first_missing_positive_41 {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentInd = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[currentInd]) {
                nums[i] = nums[i] ^ nums[currentInd];
                nums[currentInd] = nums[i] ^ nums[currentInd];
                nums[i] = nums[i] ^ nums[currentInd];
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1) {
                return j + 1;
            }
        }

        return nums.length + 1;
    }

    public static void main(String args[]) {
        int[] nums1 = { 1, 2, 0 };
        int[] nums2 = { 3, 4, -1, 1 };
        int[] nums3 = { 7, 8, 9, 11, 12 };

        System.out.println(firstMissingPositive(nums1));
        System.out.println(firstMissingPositive(nums2));
        System.out.println(firstMissingPositive(nums3));
    }
}

// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.

// Example 2:

// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.

// Example 3:

// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.


 
