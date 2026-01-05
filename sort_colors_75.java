// Dutch National Flag algorithm: partition the array in one pass using three pointers (low, mid, high) to sort 0s, 1s, and 2s in O(n) time and O(1) space.
class sort_colors_75 {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
        }
    }
}

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

