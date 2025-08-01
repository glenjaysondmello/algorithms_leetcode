class pascals_triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));

        for(int i = 1; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> prev = res.get(i - 1);

            arr.add(1);

            for(int j = 1; j < i; j++) {
                int sum = prev.get(j - 1) + prev.get(j);
                arr.add(sum);
            }

            arr.add(1);

            res.add(arr);
        }

        return res;
    }
}


// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// Example 2:

// Input: numRows = 1
// Output: [[1]]

