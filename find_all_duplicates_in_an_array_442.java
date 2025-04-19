class find_all_duplicates_in_an_array_442 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
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
                arr.add(nums[j]);
            } 
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1,1,2};
        int[] nums3 = {1};

        System.out.println(findDuplicates(nums1));
        System.out.println(findDuplicates(nums2));
        System.out.println(findDuplicates(nums3));
    }
}

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

// Example 2:

// Input: nums = [1,1,2]
// Output: [1]

// Example 3:

// Input: nums = [1]
// Output: []
  
