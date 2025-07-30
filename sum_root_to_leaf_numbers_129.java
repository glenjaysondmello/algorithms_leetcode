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

// Best Approach
class sum_root_to_leaf_numbers_129 {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    static int sum(TreeNode node, int sum) {
        if(node == null) return 0;

        sum = 10 * sum + node.val;

        if(node.left == null && node.right == null) return sum;

        int leftNode = sum(node.left, sum);
        int rightNode = sum(node.right, sum);

        return leftNode + rightNode;
    }
}

// Using string as path (not recommended)
class sum_root_to_leaf_numbers_129 {
    public int sumNumbers(TreeNode root) {
        return sum(root, "");
    }

    static int sum(TreeNode node, String path) {
        if(node == null) return 0;

        path += node.val;

        if(node.left == null && node.right == null) return Integer.parseInt(path);

        int leftNode = sum(node.left, path);
        int rightNode = sum(node.right, path);

        return leftNode + rightNode;
    }
}


// Example 1:

// Input: root = [1,2,3]
// Output: 25
// Explanation:
// The root-to-leaf path 1->2 represents the number 12.
// The root-to-leaf path 1->3 represents the number 13.
// Therefore, sum = 12 + 13 = 25.
  
// Example 2:

// Input: root = [4,9,0,5,1]
// Output: 1026
// Explanation:
// The root-to-leaf path 4->9->5 represents the number 495.
// The root-to-leaf path 4->9->1 represents the number 491.
// The root-to-leaf path 4->0 represents the number 40.
// Therefore, sum = 495 + 491 + 40 = 1026.

