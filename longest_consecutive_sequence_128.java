// Use a HashSet to detect sequence starts (num−1 absent) and expand forward to find the longest consecutive sequence in O(n) time.
class longest_consecutive_sequence_128 {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longestSeq = 0;

        Set<Integer> set = new HashSet<>();

        for(int num : nums) set.add(num);

        for(int num : set) {
            if(!set.contains(num - 1)) {
                int currNum = num;
                int currSeq = 1;

                while(set.contains(currNum + 1)) {
                    currNum++;
                    currSeq++;
                }

                longestSeq = Math.max(longestSeq, currSeq);
            }
        }

        return longestSeq;
    }
}

// Example 1:
// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

// Example 2:
// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9

// Example 3:
// Input: nums = [1,0,1,2]
// Output: 3


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
