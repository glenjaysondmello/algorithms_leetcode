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

// Intializing next inside while loop
class swap_nodes_in_pairs_24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = head.next;
        ListNode prev = null, curr = head;

        while(curr != null && curr.next != null) {
            ListNode next = curr.next;

            curr.next = next.next;
            next.next = curr;

            if(prev != null) prev.next = next;

            prev = next.next;
            curr = curr.next;
        }

        return newHead;
    }
}

// Intializing next outside while loop
class swap_nodes_in_pairs_24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = head.next;
        ListNode prev = null, curr = head, next = curr.next;

        while(curr != null && next != null) {
            curr.next = next.next;
            next.next = curr;

            if(prev != null) prev.next = next;

            prev = next.next;
            curr = curr.next;
            if(curr != null) next = curr.next;
        }

        return newHead;
    }
}

// Example 1:

// Input: head = [1,2,3,4]
// Output: [2,1,4,3]

// Example 2:

// Input: head = []
// Output: []

// Example 3:

// Input: head = [1]
// Output: [1]

// Example 4:

// Input: head = [1,2,3]
// Output: [2,1,3]

