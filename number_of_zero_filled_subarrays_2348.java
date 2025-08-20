class number_of_zero_filled_subarrays_2348 {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long cZero = 0;

        for(int num : nums) {
            if(num == 0) {
                cZero++;
                count += cZero;
            } else {
                cZero = 0;
            }
        }

        return count;
    }
}


// Example 1:

// Input: nums = [1,3,0,0,2,0,0,4]
// Output: 6
// Explanation: 
// There are 4 occurrences of [0] as a subarray.
// There are 2 occurrences of [0,0] as a subarray.
// There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.

// Example 2:

// Input: nums = [0,0,0,2,0,0]
// Output: 9
// Explanation:
// There are 5 occurrences of [0] as a subarray.
// There are 3 occurrences of [0,0] as a subarray.
// There is 1 occurrence of [0,0,0] as a subarray.
// There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.
  
// Example 3:

// Input: nums = [2,10,2019]
// Output: 0
// Explanation: There is no subarray filled with 0. Therefore, we return 0.

