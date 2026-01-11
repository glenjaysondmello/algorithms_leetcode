// Compares squares from both ends and fills the result array from right to left to maintain sorted order.
class squares_of_a_sorted_array_977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while(left <= right) {
            int leftVal = nums[left];
            int rightVal = nums[right];

            int squaredL = leftVal * leftVal;
            int squaredR = rightVal * rightVal;

            if(squaredL > squaredR) {
                arr[pos] = squaredL;

                left++;
            } else {
                arr[pos] = squaredR;

                right--;
            }

            pos--;
        }

        return arr;
    }
}

// Example 1:
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].

// Example 2:
// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

