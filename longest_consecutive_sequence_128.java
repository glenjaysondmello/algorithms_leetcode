import java.util.*;

class longest_consecutive_sequence_128 {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int maxSeq = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curMax = 1;
                while (set.contains(curNum + 1)) {
                    curNum++;
                    curMax++;
                }
                maxSeq = Math.max(maxSeq, curMax);
            }
        }
        return maxSeq;
    }

    public static void main(String args[]) {
        int[] nums1 = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums1));
        int[] nums2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println(longestConsecutive(nums2));
    }
}