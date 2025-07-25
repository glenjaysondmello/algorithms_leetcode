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

class maximum_depth_of_binary_tree_104 {
    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    static int depth(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = depth(node.left);
        int rightHeight = depth(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}


// Example 1:

// Input: root = [3,9,20,null,null,15,7]
// Output: 3

// Example 2:

// Input: root = [1,null,2]
// Output: 2

