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

class reverse_linked_list_206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while(pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;

            if(next != null) next = next.next;
        }

        return prev;
    }
}


// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
  
// Example 2:

// Input: head = [1,2]
// Output: [2,1]
// Example 3:

// Input: head = []
// Output: []

