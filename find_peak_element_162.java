class find_peak_element_162 {
    public static int findPeakElement(int[] nums) {
        int s = 0, e = nums.length - 1;

        while(s < e) {
            int mid = s + (e - s) / 2;

            if(nums[mid] > nums[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }

        return e;   // s = e
    }

    public static void main(String args[]) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(nums1));
        System.out.println(findPeakElement(nums2));
    }
}


// Example 1:

// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.

// Example 2:

// Input: nums = [1,2,1,3,5,6,4]
// Output: 5
// Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.


 
