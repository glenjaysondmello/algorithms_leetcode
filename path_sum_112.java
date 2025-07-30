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
// Approach 1
class path_sum_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root, targetSum, 0);
    }

    static boolean sum(TreeNode node, int target, int sum) {
        if(node == null) return false;

        sum += node.val;

        if(sum == target && node.left == null && node.right == null) return true;

        boolean leftNode = sum(node.left, target, sum); 
        boolean rightNode = sum(node.right, target, sum);

        return leftNode || rightNode;
    }
}

// Approach 2
class path_sum_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        int nodeVal = root.val;

        if(nodeVal == targetSum && root.left == null && root.right == null) return true;

        boolean leftNode = hasPathSum(root.left, targetSum - nodeVal); 
        boolean rightNode = hasPathSum(root.right, targetSum - nodeVal);

        return leftNode || rightNode;
    }
}


// Example 1:

// Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
// Output: true
// Explanation: The root-to-leaf path with the target sum is shown.

// Example 2:

// Input: root = [1,2,3], targetSum = 5
// Output: false
// Explanation: There are two root-to-leaf paths in the tree:
// (1 --> 2): The sum is 3.
// (1 --> 3): The sum is 4.
// There is no root-to-leaf path with sum = 5.
  
// Example 3:

// Input: root = [], targetSum = 0
// Output: false
// Explanation: Since the tree is empty, there are no root-to-leaf paths.

