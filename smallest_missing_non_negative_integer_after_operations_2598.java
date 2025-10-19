class smallest_missing_non_negative_integer_after_operations_2598 {
    public int findSmallestInteger(int[] nums, int value) {
        int[] arr = new int[value];

        for(int num : nums) {
            int rem = ((num % value) + value) % value;
            arr[rem]++;
        }

        int res = 0;

        while(arr[res % value] > 0) {
            arr[res % value]--;
            res++;
        }

        return res;
    }
}

// Example 1:

// Input: nums = [1,-10,7,13,6,8], value = 5
// Output: 4
// Explanation: One can achieve this result by applying the following operations:
// - Add value to nums[1] twice to make nums = [1,0,7,13,6,8]
// - Subtract value from nums[2] once to make nums = [1,0,2,13,6,8]
// - Subtract value from nums[3] twice to make nums = [1,0,2,3,6,8]
// The MEX of nums is 4. It can be shown that 4 is the maximum MEX we can achieve.

// Example 2:

// Input: nums = [1,-10,7,13,6,8], value = 7
// Output: 2
// Explanation: One can achieve this result by applying the following operation:
// - subtract value from nums[2] once to make nums = [1,-10,0,13,6,8]
// The MEX of nums is 2. It can be shown that 2 is the maximum MEX we can achieve.

