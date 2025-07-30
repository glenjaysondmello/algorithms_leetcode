/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
class binary_tree_maximum_path_sum_124 {
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        sum(root);
        return ans;    
    }

    public int sum(TreeNode node) {
        if(node == null) return 0;

        int leftNode = sum(node.left);
        int rightNode = sum(node.right);

        leftNode = Math.max(0, leftNode);
        rightNode = Math.max(0, rightNode);

        int path = leftNode + rightNode + node.val;
        ans = Math.max(ans, path);

        return Math.max(leftNode, rightNode) + node.val;
    }
}


// Example 1:

// Input: root = [1,2,3]
// Output: 6
// Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
  
// Example 2:

// Input: root = [-10,9,20,null,null,15,7]
// Output: 42
// Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.

