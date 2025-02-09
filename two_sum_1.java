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