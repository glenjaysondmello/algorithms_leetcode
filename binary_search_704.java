class binary_search_704 {
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 9;

        int[] nums2 = {-1,0,3,5,9,12}; 
        int target2 = 2;

        System.out.println(search(nums1, target1));
        System.out.println(search(nums2, target2));
    }
}

// Example 1:

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4

// Example 2:

// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
// Explanation: 2 does not exist in nums so return -1
