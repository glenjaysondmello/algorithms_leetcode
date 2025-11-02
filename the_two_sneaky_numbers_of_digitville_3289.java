class the_two_sneaky_numbers_of_digitville_3289 {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) arr.add(entry.getKey());
        }

        int[] resArr = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            resArr[i] = arr.get(i);
        }

        return resArr;
    }
}

// Example 1:

// Input: nums = [0,1,1,0]
// Output: [0,1]
// Explanation:
// The numbers 0 and 1 each appear twice in the array.

// Example 2:

// Input: nums = [0,3,2,1,3,2]
// Output: [2,3]
// Explanation:
// The numbers 2 and 3 each appear twice in the array.

// Example 3:

// Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
// Output: [4,5]
// Explanation:
// The numbers 4 and 5 each appear twice in the array.

