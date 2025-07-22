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

// recursive (best approach)
class symmetric_tree_101 {
    public boolean isSymmetric(TreeNode root) {
       if(root == null) return true;

       return isMirror(root.left, root.right);
    }

    static boolean isMirror(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        if(t1.val != t2.val) return false;

        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}

// iterative (BFS)
class symmetric_tree_101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while(!queue.isEmpty()) {
            TreeNode leftNode = queue.poll(); 
            TreeNode rightNode = queue.poll();

            if(leftNode == null && rightNode == null) continue;
            if(leftNode == null || rightNode == null) return false;
            if(leftNode.val != rightNode.val) return false;

            queue.offer(leftNode.left);
            queue.offer(rightNode.right);
            queue.offer(leftNode.right);
            queue.offer(rightNode.left);
        }

        return true;
    }
}


// Example 1:

// Input: root = [1,2,2,3,4,4,3]
// Output: true
  
// Example 2:

// Input: root = [1,2,2,null,3,null,3]
// Output: false

  
