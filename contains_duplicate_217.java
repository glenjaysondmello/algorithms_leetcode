import java.util.*;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int num : nums) {
            if (uniqueSet.contains(num)) {
                return true;
            }
            uniqueSet.add(num);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] num1 = { 1, 2, 3, 1 };
        int[] num2 = { 1, 2, 3, 4 };
        int[] num3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(containsDuplicate(num1));
        System.out.println(containsDuplicate(num2));
        System.out.println(containsDuplicate(num3));
    }
}