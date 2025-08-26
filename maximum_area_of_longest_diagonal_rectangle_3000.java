class maximum_area_of_longest_diagonal_rectangle_3000 {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int finalArea = 0;

        for(int[] dim : dimensions) {
            int l = dim[0], r = dim[1];

            double diag_length = Math.sqrt(l * l + r * r);
            int area = l * r;

            if(diag_length > max) {
                max = diag_length;
                finalArea = area;
            } else if(diag_length == max) {
                finalArea = Math.max(finalArea, area);
            }
        }

        return finalArea;
    }
}


// Example 1:

// Input: dimensions = [[9,3],[8,6]]
// Output: 48
// Explanation: 
// For index = 0, length = 9 and width = 3. Diagonal length = sqrt(9 * 9 + 3 * 3) = sqrt(90) ≈ 9.487.
// For index = 1, length = 8 and width = 6. Diagonal length = sqrt(8 * 8 + 6 * 6) = sqrt(100) = 10.
// So, the rectangle at index 1 has a greater diagonal length therefore we return area = 8 * 6 = 48.
  
// Example 2:

// Input: dimensions = [[3,4],[4,3]]
// Output: 12
// Explanation: Length of diagonal is the same for both which is 5, so maximum area = 12.

