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

class flatten_binary_tree_to_linked_list_114 {
    public void flatten(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        preOrder(queue, root);

        TreeNode prev = queue.poll();

        while(!queue.isEmpty()) {
           TreeNode curr = queue.poll();
           prev.left = null;
           prev.right = curr;
           prev = curr;
        }
    }

    static void preOrder(Queue<TreeNode> queue, TreeNode node) {
        if(node == null) return;

        queue.offer(node);
        preOrder(queue, node.left);
        preOrder(queue, node.right);
    }
}


// Example 1:

// Input: root = [1,2,5,3,4,null,6]
// Output: [1,null,2,null,3,null,4,null,5,null,6]
  
// Example 2:

// Input: root = []
// Output: []

// Example 3:

// Input: root = [0]
// Output: [0]

