class diagonal_traverse_498 {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0) return new int[0];
        if(mat.length == 1) return mat[0];

        int row = 0;
        int col = 0;
        int m = mat.length;
        int n = mat[0].length;

        int[] arr = new int[m * n];

        for(int i = 0; i < m * n; i++) {
            arr[i] = mat[row][col];
            int total = row + col;

            if((total % 2) == 0) {
                if(col == (n - 1)) {
                    row++;
                } else if(row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row == (m - 1)) {
                    col++;
                } else if(col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }
}


// Example 1:

// Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,4,7,5,3,6,8,9]
  
// Example 2:

// Input: mat = [[1,2],[3,4]]
// Output: [1,2,3,4]

