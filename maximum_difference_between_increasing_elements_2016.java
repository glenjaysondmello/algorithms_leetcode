// (Best approach)
class maximum_difference_between_increasing_elements_2016 {
    public static int maximumDifference(int[] nums) {
        int maxDiff = Integer.MIN_VALUE;
        int numC = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > numC) {
                maxDiff = Math.max(maxDiff, nums[i] - numC);
            } else {
                numC = nums[i];
            }
        }

        if(maxDiff == Integer.MIN_VALUE) return -1;

        return maxDiff;
    }

    public static void main(String args[]) {
        int[] nums1 = {7, 1, 5, 4}, nums2 = {9, 4, 3, 2}, nums3 = {1, 5, 2, 10};

        System.out.println(maximumDifference(nums1));
        System.out.println(maximumDifference(nums2));
        System.out.println(maximumDifference(nums3));
    }
}

// (checking the pairs for i = j + 1)
class maximum_difference_between_increasing_elements_2016 {
    public static int maximumDifference(int[] nums) {
        int maxDiff = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] >= nums[j]) {
                    continue;
                }
                int currDiff = nums[j] - nums[i];
                if(maxDiff < currDiff) {
                    maxDiff = currDiff;
                }
            }
        }

        if(maxDiff == Integer.MIN_VALUE) return -1;

        return maxDiff;
    }

    public static void main(String args[]) {
        int[] nums1 = {7, 1, 5, 4}, nums2 = {9, 4, 3, 2}, nums3 = {1, 5, 2, 10};

        System.out.println(maximumDifference(nums1));
        System.out.println(maximumDifference(nums2));
        System.out.println(maximumDifference(nums3));
    }
}

// (not recommended)
class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = Integer.MIN_VALUE;
        int i = 0, j = i + 1;

        while(i < nums.length - 1) {
            if(nums[i] >= nums[j]) {
                i = i;

                if(j == nums.length - 1) {
                    i++;
                    j = i + 1;
                } else {
                    j++;
                }

                continue;
            }

            int currDiff = nums[j] - nums[i];
            if(maxDiff < currDiff) {
                maxDiff = currDiff;
            }

            if(j == nums.length - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }
        

        if(maxDiff == Integer.MIN_VALUE) return -1;

        return maxDiff;
    }
}

// Example 1:

// Input: nums = [7,1,5,4]
// Output: 4
// Explanation:
// The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
// Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.

// Example 2:

// Input: nums = [9,4,3,2]
// Output: -1
// Explanation:
// There is no i and j such that i < j and nums[i] < nums[j].

// Example 3:

// Input: nums = [1,5,2,10]
// Output: 9
// Explanation:
// The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.



