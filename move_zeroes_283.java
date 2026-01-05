// Uses a two-pointer in-place swap approach to move all non-zero elements forward while maintaining order and pushing zeros to the end.
class move_zeroes_283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[i] = nums[i] + nums[j] - (nums[j] = nums[i]);
                j++;
            }
        }
    }
}

// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
  
// Example 2:
// Input: nums = [0]
// Output: [0]
