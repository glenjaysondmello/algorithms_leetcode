class find_subsequence_of_length_k_with_the_largest_sum_2099 {
    public static int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] numsWithIndex = new int[n][2];
        int[] res = new int[k];

        for(int i = 0; i < n; i++) {
            numsWithIndex[i][0] = nums[i];
            numsWithIndex[i][1] = i;
        }

        Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(b[0], a[0]));

        Arrays.sort(numsWithIndex, 0, k, Comparator.comparingInt(a -> a[1]));

        for(int i = 0; i < k; i++) {
            res[i] = numsWithIndex[i][0];
        }

        return res;
    }

    public static void main(String args[]) {
        int[] nums1 = {2,1,3,3};
        int[] nums2 = {-1,-2,3,4};
        int[] nums3 = {3,4,3,3};

        int k1 = 2, k2 = 3, k3 = 2;

        System.out.println(maxSubsequence(nums1, k1));
        System.out.println(maxSubsequence(nums2, k2));
        System.out.println(maxSubsequence(nums3, k3));
    }
}


// Example 1:

// Input: nums = [2,1,3,3], k = 2
// Output: [3,3]
// Explanation:
// The subsequence has the largest sum of 3 + 3 = 6.
  
// Example 2:

// Input: nums = [-1,-2,3,4], k = 3
// Output: [-1,3,4]
// Explanation: 
// The subsequence has the largest sum of -1 + 3 + 4 = 6.
  
// Example 3:

// Input: nums = [3,4,3,3], k = 2
// Output: [3,4]
// Explanation:
// The subsequence has the largest sum of 3 + 4 = 7. 
// Another possible subsequence is [4, 3].



  
