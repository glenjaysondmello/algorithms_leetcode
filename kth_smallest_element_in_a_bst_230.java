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

class kth_smallest_element_in_a_bst_230 {
    int count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;

        int leftNode = kthSmallest(root.left, k);

        if(leftNode != 0) return leftNode;

        count++;

        if(count == k) return root.val;

        return kthSmallest(root.right, k);
    }
}


// Example 1:

// Input: root = [3,1,4,null,2], k = 1
// Output: 1
  
// Example 2:

// Input: root = [5,3,6,2,4,null,null,1], k = 3
// Output: 3

