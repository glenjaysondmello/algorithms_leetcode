// Space optimized tabulation using 1D DP: Computes paths row by row storing only previous row.
class unique_paths_62 {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];

        for(int i = 0; i < m; i++) {
            int[] temp = new int[n];

            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    temp[j] = 1;
                } else {
                    int up = dp[j];
                    int left = 0;
                     
                    if(j > 0) left = temp[j - 1];

                    temp[j] = up + left; 
                }
            }

            dp = temp;
        }

        return dp[n - 1];
    }
}

// Bottom-up dynamic programming using 2D table where dp[i][j] stores ways to reach that cell.
class unique_paths_62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else {
                    int up = 0, left = 0;

                    if(i > 0) up = dp[i - 1][j]; 
                    if(j > 0) left = dp[i][j - 1];

                    dp[i][j] = up + left; 
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}

// Top-down recursion with memoization caching results to avoid repeated subproblems.
class unique_paths_62 {
    public int uniquePaths(int m, int n) {
        Integer[][] dp = new Integer[m][n];

        return helper(m - 1, n - 1, dp);
    }

    static int helper(int m, int n, Integer[][] dp) {
        if(m == 0 && n == 0) return 1;
        else if(m < 0 || n < 0) return 0;

        if(dp[m][n] != null) return dp[m][n];

        int up = helper(m - 1, n, dp);
        int left = helper(m, n - 1, dp);

        return dp[m][n] = up + left;
    }
}

// Top-down recursion with memoization caching results to avoid repeated subproblems.
class Solution {
    public int uniquePaths(int m, int n) {
        return helper(m - 1, n - 1);
    }

    static int helper(int m, int n) {
        if(m == 0 && n == 0) return 1;
        else if(m < 0 || n < 0) return 0;

        int up = helper(m - 1, n);
        int left = helper(m, n - 1);

        return up + left;
    }
}

// Example 1:

// Input: m = 3, n = 7
// Output: 28
  
// Example 2:

// Input: m = 3, n = 2
// Output: 3
// Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Down -> Down
// 2. Down -> Down -> Right
// 3. Down -> Right -> Down

