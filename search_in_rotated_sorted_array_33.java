class search_in_rotated_sorted_array_33 {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // int first = binarySearch(nums, target, 0, pivot);
        // if(first != -1) {
        //     return first;
        // } else {
        //     return binarySearch(nums, target, pivot + 1, nums.length - 1);
        // }

        if(pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if(nums[pivot] == target) {
            return pivot;
        }

        if(target == nums[0]) {
            return 0;
        }

        if(target > nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if(arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int[] nums2 = {1};
        int target1 = 0, target2 = 3;

        System.out.println(search(nums1, target1));
        System.out.println(search(nums1, target2));
        System.out.println(search(nums2, target1));
    }
}


// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

// Example 2:

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1

// Example 3:

// Input: nums = [1], target = 0
// Output: -1



