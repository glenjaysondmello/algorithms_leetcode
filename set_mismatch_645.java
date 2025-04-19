class set_mismatch_645 {
    public static int[] findErrorNums(int[] nums) {
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
                return new int[]{nums[j], j + 1};
            } 
        }
        return new int[]{-1, -1};
    }

    public static void main(String args[]) {
        int[] nums1 = {1,2,2,4};
        int[] nums2 = {1,1};

        System.out.println(findErrorNums(nums1));
        System.out.println(findErrorNums(nums2));
    }
}

// Example 1:

// Input: nums = [1,2,2,4]
// Output: [2,3]
  
// Example 2:

// Input: nums = [1,1]
// Output: [1,2]

