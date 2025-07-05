class find_lucky_integer_in_an_array_1394 {
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getKey() == entry.getValue()) max = Math.max(max, entry.getKey());
        }

        if(max == Integer.MIN_VALUE) return -1;

        return max;
    }

    public static void main(String args[]) {
        int[] arr1 = {2,2,3,4}; 
        int[] arr2 = {1,2,2,3,3,3}; 
        int[] arr3 = {2,2,2,3,3};

        System.out.println(findLucky(arr1));
        System.out.println(findLucky(arr2));
        System.out.println(findLucky(arr3));
    }
}


// Example 1:

// Input: arr = [2,2,3,4]
// Output: 2
// Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
  
// Example 2:

// Input: arr = [1,2,2,3,3,3]
// Output: 3
// Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
  
// Example 3:

// Input: arr = [2,2,2,3,3]
// Output: -1
// Explanation: There are no lucky numbers in the array.


  
