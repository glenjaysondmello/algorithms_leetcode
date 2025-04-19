class find_all_numbers_diappeared_in_array_448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
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
                arr.add(j + 1);
            } 
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1,1};

        System.out.println(findDisappearedNumbers(nums1));
        System.out.println(findDisappearedNumbers(nums2));
    }
}

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Example 2:

// Input: nums = [1,1]
// Output: [2]
