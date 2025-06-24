class find_all_k_distant_indices_in_an_array_2200 {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> jArr = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key) {
                jArr.add(i);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < jArr.size(); j++) {
                int dis = Math.abs(i - jArr.get(j));
                if(dis <= k) {
                    arr.add(i);
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String args[]) {
        int[] nums1 = {3,4,9,1,3,9,5};
        int[] nums2 = {2,2,2,2,2};
        int key1 = 9, key2 = 2;
        int k1 = 1, k2 = 2;

        System.out.println(findKDistantIndices(nums1, key1, k1));
        System.out.println(findKDistantIndices(nums2, key2, k2));
    }
}


// Example 1:

// Input: nums = [3,4,9,1,3,9,5], key = 9, k = 1
// Output: [1,2,3,4,5,6]
// Explanation: Here, nums[2] == key and nums[5] == key.
// - For index 0, |0 - 2| > k and |0 - 5| > k, so there is no j where |0 - j| <= k and nums[j] == key. Thus, 0 is not a k-distant index.
// - For index 1, |1 - 2| <= k and nums[2] == key, so 1 is a k-distant index.
// - For index 2, |2 - 2| <= k and nums[2] == key, so 2 is a k-distant index.
// - For index 3, |3 - 2| <= k and nums[2] == key, so 3 is a k-distant index.
// - For index 4, |4 - 5| <= k and nums[5] == key, so 4 is a k-distant index.
// - For index 5, |5 - 5| <= k and nums[5] == key, so 5 is a k-distant index.
// - For index 6, |6 - 5| <= k and nums[5] == key, so 6 is a k-distant index.
// Thus, we return [1,2,3,4,5,6] which is sorted in increasing order. 

// Example 2:

// Input: nums = [2,2,2,2,2], key = 2, k = 2
// Output: [0,1,2,3,4]
// Explanation: For all indices i in nums, there exists some index j such that |i - j| <= k and nums[j] == key, so every index is a k-distant index. 
// Hence, we return [0,1,2,3,4].


