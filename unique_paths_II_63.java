// Space optimized DP using 1D array, updating row by row while handling obstacles.
class unique_paths_II_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[] dp = new int[n];

        for(int i = 0; i < m; i++) {
            int[] temp = new int[n];

            for(int j = 0; j < n; j++) {
                if(i >= 0 && j >= 0 && obstacleGrid[i][j] == 1) {
                    temp[j] = 0;
                } else if(i == 0 && j == 0) {
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

// Bottom-up DP using 2D table where each cell accumulates paths unless blocked by an obstacle.
class unique_paths_II_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i >= 0 && j >= 0 && obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else if(i == 0 && j == 0) {
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

// Top-down recursion with memoization caching subproblem results while skipping blocked cells.
class unique_paths_II_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        Integer[][] dp = new Integer[m][n];

        return helper(obstacleGrid, m - 1, n - 1, dp);
    }

    static int helper(int[][] grid, int m, int n, Integer[][] dp) {
        if(m >= 0 && n >= 0 && grid[m][n] == 1) return 0;
        else if(m == 0 && n == 0) return 1;
        else if(m < 0 || n < 0) return 0;

        if(dp[m][n] != null) return dp[m][n];

        int up = helper(grid, m - 1, n, dp);
        int left = helper(grid, m, n - 1, dp);

        return dp[m][n] = up + left;
    }
}

// Simple recursive solution exploring all possible paths while checking for obstacles (very slow).
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        return helper(obstacleGrid, m - 1, n - 1);
    }

    static int helper(int[][] grid, int m, int n) {
        if(m >= 0 && n >= 0 && grid[m][n] == 1) return 0;
        else if(m == 0 && n == 0) return 1;
        else if(m < 0 || n < 0) return 0;

        int up = helper(grid, m - 1, n);
        int left = helper(grid, m, n - 1);

        return up + left;
    }
}

// Example 1:

// Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
// Output: 2
// Explanation: There is one obstacle in the middle of the 3x3 grid above.
// There are two ways to reach the bottom-right corner:
// 1. Right -> Right -> Down -> Down
// 2. Down -> Down -> Right -> Right
  
// Example 2:

// Input: obstacleGrid = [[0,1],[0,0]]
// Output: 1

