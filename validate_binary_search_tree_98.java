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

// Taking long
class validate_binary_search_tree_98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);       
    }

    static boolean isValid(TreeNode node, long low, long high) {
        if(node == null) return true;

        if(node.val <= low) return false;
        if(node.val >= high) return false;

        boolean leftNode = isValid(node.left, low, node.val);
        boolean rightNode = isValid(node.right, node.val, high);

        return leftNode && rightNode;
    }
}

// Taking low , high has null
class validate_binary_search_tree_98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);       
    }

    static boolean isValid(TreeNode node, Integer low, Integer high) {
        if(node == null) return true;

        if(low != null && node.val <= low) return false;
        if(high != null && node.val >= high) return false;

        boolean leftNode = isValid(node.left, low, node.val);
        boolean rightNode = isValid(node.right, node.val, high);

        return leftNode && rightNode;
    }
}


// Example 1:

// Input: root = [2,1,3]
// Output: true
  
// Example 2:

// Input: root = [5,1,4,null,null,3,6]
// Output: false
// Explanation: The root node's value is 5 but its right child's value is 4.

