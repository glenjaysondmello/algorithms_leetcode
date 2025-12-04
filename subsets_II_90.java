// Sort and use backtracking while skipping duplicate elements at the same recursion level to avoid duplicate subsets.
class subsets_II_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), res);

        return res;
    }

    static void helper(int[] nums, int start, List<Integer> arr, List<List<Integer>> res) {
        res.add(new ArrayList<>(arr));

        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) continue;

            arr.add(nums[i]);
            helper(nums, i + 1, arr, res);
            
            arr.remove(arr.size() - 1);
        }
    }
}

// Example 1:

// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

// Example 2:

// Input: nums = [0]
// Output: [[],[0]]

