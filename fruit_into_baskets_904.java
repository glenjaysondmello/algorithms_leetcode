// Applies a variable-size sliding window with a HashMap to keep at most two fruit types in the window while maximizing the total number of fruits collected.
class fruit_into_baskets_904 {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int winStart = 0;
        int maxFruits = Integer.MIN_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int winEnd = 0; winEnd < n; winEnd++) {
            int endFruit = fruits[winEnd];
            map.put(endFruit, map.getOrDefault(endFruit, 0) + 1);

            while(map.size() > 2) {
                int startFruit = fruits[winStart];
                map.put(startFruit, map.get(startFruit) - 1);

                if(map.get(startFruit) == 0) map.remove(startFruit);

                winStart++;
            }

            maxFruits = Math.max(maxFruits, winEnd - winStart + 1);
        }

        return maxFruits;
    }
}

// Example 1:
// Input: fruits = [1,2,1]
// Output: 3
// Explanation: We can pick from all 3 trees.

// Example 2:
// Input: fruits = [0,1,2,2]
// Output: 3
// Explanation: We can pick from trees [1,2,2].
// If we had started at the first tree, we would only pick from trees [0,1].
  
// Example 3:
// Input: fruits = [1,2,3,2,2]
// Output: 4
// Explanation: We can pick from trees [2,3,2,2].
// If we had started at the first tree, we would only pick from trees [1,2].

