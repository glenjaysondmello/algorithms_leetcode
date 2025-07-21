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
 
class binary_tree_right_side_view_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if(i == levelSize - 1) res.add(currentNode.val);

                if(currentNode.left != null) queue.offer(currentNode.left);
                if(currentNode.right != null) queue.offer(currentNode.right);
            }
        }

        return res;
    }
}


// Example 1:

// Input: root = [1,2,3,null,5,null,4]
// Output: [1,3,4]

// Example 2:

// Input: root = [1,2,3,4,null,null,null,5]
// Output: [1,3,4,5]

// Example 3:

// Input: root = [1,null,3]
// Output: [1,3]

// Example 4:

// Input: root = []
// Output: []

