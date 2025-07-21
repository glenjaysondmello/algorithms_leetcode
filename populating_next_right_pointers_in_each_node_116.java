/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class populating_next_right_pointers_in_each_node_116 {
    public Node connect(Node root) {
        if(root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            Node prev = null;

            for(int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();

                if(prev != null) {
                    prev.next = currentNode;
                }

                prev = currentNode;

                if(currentNode.left != null) queue.offer(currentNode.left);
                if(currentNode.right != null) queue.offer(currentNode.right);
            }
        }

        return root;
    }
}


// Example 1:

// Input: root = [1,2,3,4,5,6,7]
// Output: [1,#,2,3,#,4,5,6,7,#]
// Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
  
// Example 2:

// Input: root = []
// Output: []

