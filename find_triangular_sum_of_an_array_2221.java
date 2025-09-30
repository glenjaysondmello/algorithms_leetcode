// Modifing the existing array in each loop till nums.length - 1
class find_triangular_sum_of_an_array_2221 {
    public int triangularSum(int[] nums) {
        int k = nums.length;

        while(k > 1) {
            for(int i = 0; i < k - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }

            k--;
        }

        return nums[0];
    }
}

// Creating new array for each loop
class find_triangular_sum_of_an_array_2221 {
    public int triangularSum(int[] nums) {
        int  k = nums.length;
        int[] prevNums = nums;

        while(k > 1) {
            int n = prevNums.length - 1;
            int[] newNums = new int[n];

            for(int i = 0; i < n; i++) {
                newNums[i] = (prevNums[i] + prevNums[i + 1]) % 10;
            }

            prevNums = newNums;
            k--;
        }

        return prevNums[0];
    }
}

// Example 1:

// Input: nums = [1,2,3,4,5]
// Output: 8
// Explanation:
// The above diagram depicts the process from which we obtain the triangular sum of the array.

// Example 2:

// Input: nums = [5]
// Output: 5
// Explanation:
// Since there is only one element in nums, the triangular sum is the value of that element itself.

