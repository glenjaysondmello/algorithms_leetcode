// Approach 1 (Recommended)
class longest_harmonious_subsequence_594 {
    public static int findLHS(int[] nums) {
        int max = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()) {
            if(map.containsKey(num + 1)) {
                int curSum = map.get(num) + map.get(num + 1);
                max = Math.max(max, curSum);
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int[] nums1 = {1,3,2,2,5,2,3,7};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,1};

        System.out.println(findLHS(nums1));
        System.out.println(findLHS(nums2));
        System.out.println(findLHS(nums3));
    }
}


// Approach 2
class longest_harmonious_subsequence_594 {
    public static int findLHS(int[] nums) {
        int max = 0;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Map.Entry<Integer, Integer> prevEntry = null;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(prevEntry != null) {
                if(entry.getKey() - prevEntry.getKey() == 1) {
                    int curSum = entry.getValue() + prevEntry.getValue();
                    max = Math.max(max, curSum);
                }
            }

            prevEntry = entry;
        }

        return max;
    }

    public static void main(String args[]) {
        int nums1 = {1,3,2,2,5,2,3,7};
        int nums2 = {1,2,3,4};
        int nums3 = {1,1,1,1};

        System.out.println(findLHS(nums1));
        System.out.println(findLHS(nums2));
        System.out.println(findLHS(nums3));
    }
}


// Example 1:

// Input: nums = [1,3,2,2,5,2,3,7]

// Output: 5

// Explanation:

// The longest harmonious subsequence is [3,2,2,2,3].

// Example 2:

// Input: nums = [1,2,3,4]

// Output: 2

// Explanation:

// The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

// Example 3:

// Input: nums = [1,1,1,1]

// Output: 0

// Explanation:

// No harmonic subsequence exists.


  
