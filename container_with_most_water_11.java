class container_with_most_water_11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while(left < right) {
            int v1 = height[left];
            int v2 = height[right];

            int w = Math.min(v1, v2);
            int l = right - left;

            int area = w * l;

            maxArea = Math.max(maxArea, area);

            if(v1 < v2) {
                left++;
            } else if(v1 > v2) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxArea;
    }
}

// Example 1:

// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:

// Input: height = [1,1]
// Output: 1


// -----------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

class container_with_most_water_11 {
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
