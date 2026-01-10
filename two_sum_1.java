// Stores each number with its index in a HashMap to instantly check if the required complement has already been seen.
class two_sum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numsMap.containsKey(complement)) {
                return new int[] { numsMap.get(complement), i };
            }

            numsMap.put(nums[i], i);
        }

        return new int[] {};
    }
}

// Sorts values with original indices, then uses two pointers to find the target sum.
class two_sum_1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int left = 0;
        int right = n - 1;

        while(left < right) {
            int curSum = arr[left][0] + arr[right][0];

            if(curSum < target) left++;
            else if(curSum > target) right--;
            else return new int[]{arr[left][1], arr[right][1]};
        }

        return new int[]{-1, -1};
    }
}

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]


import java.util.*;

class two_sum_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int complement = target - nums[i];
            if (numsMap.containsKey(complement)) {
                return new int[] { numsMap.get(complement), i };
            }
            numsMap.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String args[]) {
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;

        int[] nums3 = { 3, 3 };
        int target3 = 6;

        System.out.println(twoSum(nums1, target1));
        System.out.println(twoSum(nums2, target2));
        System.out.println(twoSum(nums3, target3));
    }
}