import java.util.*;

class top_k_frequent_elements_347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Set<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new HashSet<>());
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
            bucket.get(freq).add(key);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.size() - 1; i >= 0 && result.size() < k; i--) {
            if (!bucket.get(i).isEmpty()) {
                result.addAll(bucket.get(i));
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String args[]) {
        int[] nums1 = { 1, 1, 1, 2, 2, 3 };
        int k1 = 2;
        int[] nums2 = { 1 };
        int k2 = 1;
        System.out.println(topKFrequent(nums1, k1));
        System.out.println(topKFrequent(nums2, k2));
    }
}