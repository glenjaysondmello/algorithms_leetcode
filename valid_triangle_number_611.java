// Two Pointers after Sorting (Optimized O(n²))
class valid_triangle_number_611 {
    public int triangleNumber(int[] nums) {
        int count = 0;

        Arrays.sort(nums);

        for(int i = nums.length - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while(left < right) {
                if((nums[left] + nums[right]) > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }
}

// Brute Force with Triple Nested Loops (O(n³))
class valid_triangle_number_611 {
    public int triangleNumber(int[] nums) {
        int count = 0;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if((nums[i] + nums[j]) > nums[k]) count++;
                }
            }
        }

        return count;
    }
}

// Example 1:

// Input: nums = [2,2,3,4]
// Output: 3
// Explanation: Valid combinations are: 
// 2,3,4 (using the first 2)
// 2,3,4 (using the second 2)
// 2,2,3
  
// Example 2:

// Input: nums = [4,2,3,4]
// Output: 4

  
