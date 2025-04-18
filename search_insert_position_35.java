class search_insert_position_35 {
    public static int searchInsert(int[] nums, int target) {
        int searchItem;
        int start = 0, end = nums.length - 1;
        searchItem = binarySearch(nums, start, end, target);
        
        if(searchItem == -1) {
            int[] newArr = insertEleArray(nums, nums.length, target);
            newArr = insertionSort(newArr);
            searchItem = binarySearch(newArr, start, newArr.length - 1, target);
        }

        return searchItem;
    }

    static int[] insertionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j - 1] > arr[j]) {
                    arr[j] = arr[j] + arr[j - 1] - (arr[j - 1] = arr[j]);
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    static int[] insertEleArray(int[] arr, int insertIndex, int target) {
        int[] newArray = new int[arr.length + 1];
        int j = 0;
        for(int i = 0; i < newArray.length; i++) {
            if(i == insertIndex) {
                newArray[i] = target;
            } else {
                newArray[i] = arr[j];
                j++;
            }
        }

        return newArray;
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target) {
                return mid;
            }

            if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] nums = {1,3,5,6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println(searchInsert(nums, target1));
        System.out.println(searchInsert(nums, target2));
        System.out.println(searchInsert(nums, target3));
    }
}

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2

// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1

// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4
 
