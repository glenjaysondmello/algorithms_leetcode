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

class cousins_in_binary_tree_993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xn = findNode(root, x);
        TreeNode yn = findNode(root, y);

        return (
            (level(root, xn, 0) == level(root, yn, 0)) && (!isSibling(root, xn, yn))
        );
    }

    static TreeNode findNode(TreeNode node, int n) {
        if(node == null) return null;
        if(node.val == n) return node;

        TreeNode left = findNode(node.left, n);
        if(left != null) return left;

        return findNode(node.right, n);
    }

    static boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if(node == null) return false;

        return (
            (node.left == x && node.right == y) || (node.left == y && node.right == x) || isSibling(node.left, x, y) || isSibling(node.right, x, y)
        );
    }

    static int level(TreeNode node, TreeNode n, int lvl) {
        if(node == null) return 0;
        if(node == n) return lvl;

        int l = level(node.left, n, lvl + 1);
        if(l != 0) return l;

        return level(node.right, n, lvl + 1);
    }
}


// Example 1:

// Input: root = [1,2,3,4], x = 4, y = 3
// Output: false
  
// Example 2:

// Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
// Output: true

// Example 3:

// Input: root = [1,2,3,null,4], x = 2, y = 3
// Output: false

