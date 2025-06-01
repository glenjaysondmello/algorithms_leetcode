class split_array_largest_sum_410 {
    public static int splitArray(int[] nums, int k) {
        int lowerBound = 0, upperBound = 0;

        for(int i = 0; i < nums.length; i++) {
            lowerBound = Math.max(lowerBound, nums[i]);
            upperBound += nums[i];
        }

        return binarySearch(nums, k, lowerBound, upperBound);
    }

    static int binarySearch(int[] arr, int k, int start, int end) {
        while(start < end) {
            int mid = start + (end  - start) / 2;
            int sum = 0;
            int pairs = 1;

            for(int i = 0; i < arr.length; i++) {
                if(sum + arr[i] <= mid) {
                    sum += arr[i];
                } else {
                    pairs++;
                    sum = arr[i];
                }
            }

            if(pairs <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String args[]) {
        int[] nums1 = {7, 2, 5, 10, 8};
        int[] nums2 = {1, 2, 3,4, 5};
        int k = 2;

        System.out.println(splitArray(nums1, k));
        System.out.println(splitArray(nums2, k));
    }
}


// Example 1:

// Input: nums = [7,2,5,10,8], k = 2
// Output: 18
// Explanation: There are four ways to split nums into two subarrays.
// The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
  
// Example 2:

// Input: nums = [1,2,3,4,5], k = 2
// Output: 9
// Explanation: There are four ways to split nums into two subarrays.
// The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.


  
