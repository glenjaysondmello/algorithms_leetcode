class count_elements_with_maximum_frequency_3005 {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            max = Math.max(max, entry.getValue());
        }

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if(entry.getValue() == max) {
                sum += entry.getValue();
            }
        }

        return sum;
    }
}

// Example 1:

// Input: nums = [1,2,2,3,1,4]
// Output: 4
// Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
// So the number of elements in the array with maximum frequency is 4.

// Example 2:

// Input: nums = [1,2,3,4,5]
// Output: 5
// Explanation: All elements of the array have a frequency of 1 which is the maximum.
// So the number of elements in the array with maximum frequency is 5.

