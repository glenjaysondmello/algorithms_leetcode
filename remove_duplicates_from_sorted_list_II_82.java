/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Use two pointers and a dummy node to skip all nodes with duplicate values in a sorted linked list.
class remove_duplicates_from_sorted_list_II_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode prev = dummyNode;
        ListNode node = head;

        while(node != null && node.next != null) {
            if(node.val == node.next.val) {
                while(node.next != null && node.val == node.next.val) {
                    node = node.next;
                }

                prev.next = node.next;
            } else {
                prev = prev.next;
                // prev = node;
            }

            node = node.next;
        }

        return dummyNode.next;
    }
}

// Example 1:

// Input: head = [1,2,3,3,4,4,5]
// Output: [1,2,5]

// Example 2:

// Input: head = [1,1,1,2,3]
// Output: [2,3]

