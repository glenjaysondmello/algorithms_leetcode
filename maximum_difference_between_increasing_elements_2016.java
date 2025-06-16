class maximum_difference_between_increasing_elements_2016 {
    public int maximumDifference(int[] nums) {
        int maxDiff = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] >= nums[j]) {
                    continue;
                }
                int currDiff = nums[j] - nums[i];
                if(maxDiff < currDiff) {
                    maxDiff = currDiff;
                }
            }
        }

        if(maxDiff == Integer.MIN_VALUE) return -1;

        return maxDiff;
    }
}
