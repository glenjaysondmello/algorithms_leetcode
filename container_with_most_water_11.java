import java.util.*;

class Solution {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int weight = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int area = weight * currentHeight;
            max = Math.max(area, max);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1,1};
        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));
    }
}
