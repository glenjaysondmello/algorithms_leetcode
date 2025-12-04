class subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        helper(nums, 0, new ArrayList<>(), res);

        return res;
    }

    static void helper(int[] nums, int i, List<Integer> arr, List<List<Integer>> res) {
        if(i == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }

        helper(nums, i + 1, arr, res);
        arr.add(nums[i]);
        helper(nums, i + 1, arr, res);

        arr.remove(arr.size() - 1);
    }
}

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
  
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]

