class find_x_sum_of_all_k_long_subarrays_i_3318 {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] res = new int[nums.length - k + 1];

        for(int i = 0; i < res.length; i++) {
            HashMap<Integer, Integer> freq = new HashMap<>();

            for(int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());

            entries.sort((a, b) -> {
                if(!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue();
                } else {
                    return b.getKey() - a.getKey();
                }
            });

            int sum = 0;

            for(int t = 0; t < Math.min(x, entries.size()); t++) {
                sum += entries.get(t).getKey() * entries.get(t).getValue();
            }

            res[i] = sum;
        }

        return res;
    }
}

// Example 1:

// Input: nums = [1,1,2,2,3,4,2,3], k = 6, x = 2
// Output: [6,10,12]
// Explanation:
// For subarray [1, 1, 2, 2, 3, 4], only elements 1 and 2 will be kept in the resulting array. Hence, answer[0] = 1 + 1 + 2 + 2.
// For subarray [1, 2, 2, 3, 4, 2], only elements 2 and 4 will be kept in the resulting array. Hence, answer[1] = 2 + 2 + 2 + 4. Note that 4 is kept in the array since it is bigger than 3 and 1 which occur the same number of times.
// For subarray [2, 2, 3, 4, 2, 3], only elements 2 and 3 are kept in the resulting array. Hence, answer[2] = 2 + 2 + 2 + 3 + 3.

// Example 2:

// Input: nums = [3,8,7,8,7,5], k = 2, x = 2
// Output: [11,15,15,15,12]
// Explanation:
// Since k == x, answer[i] is equal to the sum of the subarray nums[i..i + k - 1].

