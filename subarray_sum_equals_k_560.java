// Uses prefix sums with a frequency HashMap to count how many previous sums make the current subarray sum equal to k in O(n) time.
class subarray_sum_equals_k_560 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int num : nums) {
            sum += num;

            if(map.containsKey(sum - k)) count += map.get(sum - k);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

// Example 1:
// Input: nums = [1,1,1], k = 2
// Output: 2

// Example 2:
// Input: nums = [1,2,3], k = 3
// Output: 2

