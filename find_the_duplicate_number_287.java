class find_the_duplicate_number_287 {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int currentInd = nums[i] - 1;
            if(nums[i] != nums[currentInd]) {
                nums[i] = nums[i] ^ nums[currentInd];
                nums[currentInd] = nums[i] ^ nums[currentInd];
                nums[i] = nums[i] ^ nums[currentInd];
            } else {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++) {
            if(j != nums[j] - 1) {
                return nums[j];
            } 
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};
        int[] nums3 = {3,3,3,3,3};

        System.out.println(findDuplicate(nums1));
        System.out.println(findDuplicate(nums2));
        System.out.println(findDuplicate(nums3));
    }
}

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
  
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3
  
// Example 3:

// Input: nums = [3,3,3,3,3]
// Output: 3
