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

class binary_tree_zigzag_level_order_traversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse  = false;

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < levelSize; i++) {
                if(reverse) {
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);

                    if(currentNode.right != null) queue.offerFirst(currentNode.right);
                    if(currentNode.left != null) queue.offerFirst(currentNode.left);
                } else {
                    TreeNode currentNode = queue.poll();
                    currentLevel.add(currentNode.val);

                    if(currentNode.left != null) queue.offer(currentNode.left);
                    if(currentNode.right != null) queue.offer(currentNode.right);
                }
            }

            res.add(currentLevel);
            reverse = !reverse;
        }

        return res;
    }
}


// Example 1:

// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[20,9],[15,7]]
  
// Example 2:

// Input: root = [1]
// Output: [[1]]
  
// Example 3:

// Input: root = []
// Output: []

