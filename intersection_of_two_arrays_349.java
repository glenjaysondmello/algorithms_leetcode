// Approach 1: Use HashSet to store elements of nums1 and collect unique common elements in O(n + m) time without sorting.
class intersection_of_two_arrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for(int num1 : nums1) set.add(num1);

        for(int num2 : nums2) {
            if(set.contains(num2)) intersect.add(num2);
        }

        int i = 0;
        int[] res = new int[intersect.size()];

        for(Integer num : intersect) res[i++] = num;

        return res;
    }
}

// Approach 2: Sort both arrays and use two pointers to find common elements efficiently while avoiding duplicates.
class intersection_of_two_arrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();

        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) i++;
            else if(nums2[j] < nums1[i]) j++;
            else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        int k = 0;
        int[] res = new int[set.size()];

        for(int num : set) res[k++] = num;

        return res;
    }
}

// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

// Example 2:
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

