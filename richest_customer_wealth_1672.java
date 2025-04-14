class richest_customer_wealth_1672 {
    public static int maximumWealth(int[][] accounts) {
        int richWealth = 0;
        for(int[] row : accounts) {
            int wealth = 0; 
            for(int col : row) {
                wealth += col;
                if(wealth >= richWealth) {
                    richWealth = wealth;
                }
            }
        }
        return richWealth;
    }

    public static void main(String args[]) {
        int[][] accounts1 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] accounts2 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int[][] accounts3 = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts1));
        System.out.println(maximumWealth(accounts2));
        System.out.println(maximumWealth(accounts3));
    }
}

// Example 1:

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.
  
// Example 2:

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.
  
// Example 3:

// Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
// Output: 17
