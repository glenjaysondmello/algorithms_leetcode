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
 
class invert_binary_tree_226 {
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }

    static TreeNode invert(TreeNode node) {
        if(node == null) return null;

        TreeNode leftNode = invert(node.left);
        TreeNode rightNode = invert(node.right);

        node.left = rightNode;
        node.right = leftNode;

        return node;
    }
}


// Example 1:

// Input: root = [4,2,7,1,3,6,9]
// Output: [4,7,2,9,6,3,1]
  
// Example 2:

// Input: root = [2,1,3]
// Output: [2,3,1]
  
// Example 3:

// Input: root = []
// Output: []

