class partition_array_such_that_maximum_difference_is_k_2294 {
    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int start = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - start > k) {
                count++;
                start = nums[i];
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int[] nums1 = {3, 6, 1, 2, 5};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 2, 4, 5};
        int k1 = 2, k2 = 1, k3 = 0;

        System.out.println(partitionArray(nums1, k1));
        System.out.println(partitionArray(nums2, k2));
        System.out.println(partitionArray(nums3, k3));
    }
}


// Example 1:

// Input: nums = [3,6,1,2,5], k = 2
// Output: 2
// Explanation:
// We can partition nums into the two subsequences [3,1,2] and [6,5].
// The difference between the maximum and minimum value in the first subsequence is 3 - 1 = 2.
// The difference between the maximum and minimum value in the second subsequence is 6 - 5 = 1.
// Since two subsequences were created, we return 2. It can be shown that 2 is the minimum number of subsequences needed.
  
// Example 2:

// Input: nums = [1,2,3], k = 1
// Output: 2
// Explanation:
// We can partition nums into the two subsequences [1,2] and [3].
// The difference between the maximum and minimum value in the first subsequence is 2 - 1 = 1.
// The difference between the maximum and minimum value in the second subsequence is 3 - 3 = 0.
// Since two subsequences were created, we return 2. Note that another optimal solution is to partition nums into the two subsequences [1] and [2,3].
  
// Example 3:

// Input: nums = [2,2,4,5], k = 0
// Output: 3
// Explanation:
// We can partition nums into the three subsequences [2,2], [4], and [5].
// The difference between the maximum and minimum value in the first subsequences is 2 - 2 = 0.
// The difference between the maximum and minimum value in the second subsequences is 4 - 4 = 0.
// The difference between the maximum and minimum value in the third subsequences is 5 - 5 = 0.
// Since three subsequences were created, we return 3. It can be shown that 3 is the minimum number of subsequences needed.


