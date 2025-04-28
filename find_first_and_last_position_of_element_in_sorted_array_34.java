class find_first_and_last_position_of_element_in_sorted_array_34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        
        res[0] = bSearch(nums, target, true);
        if(res[0] != -1) {
            res[1] = bSearch(nums, target, false);
        }

        return res;
        
        // int start, end;
        
        // start = bSearch(nums, target, true);
        // end = bSearch(nums, target, false);

        // return new int[]{start, end};
    }

    static int bSearch(int[] nums, int target, boolean firstIndex) {
        int start = 0, end = nums.length - 1;
        int res = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                res = mid;
                if(firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int[] nums1 = {5,7,7,8,8,10};
        int[] nums2 = {5,7,7,8,8,10};
        int[] nums3 = {};

        int target1 = 8, target2 = 6, target3 = 0;

        System.out.println(searchRange(nums1, target1));
        System.out.println(searchRange(nums2, target2));
        System.out.println(searchRange(nums3, target3));
    }
}


// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]



