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
 
class reverse_linked_list_ii_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;

        ListNode prev = null;
        ListNode pres = head;

        for(int i = 0; i < left - 1; i++) {
            prev = pres;
            pres = pres.next;
        }

        ListNode start = prev;
        ListNode end = pres;

        ListNode next = pres.next;

        for(int i = 0; i < right - left + 1; i++) {
            pres.next = prev;
            prev = pres;
            pres = next;

            if(next != null) next = next.next;
        }

        if(start != null) {
            start.next = prev;
        } else {
            head = prev;
        }

        end.next = pres;

        return head;
    }
}


// Example 1:

// Input: head = [1,2,3,4,5], left = 2, right = 4
// Output: [1,4,3,2,5]
  
// Example 2:

// Input: head = [5], left = 1, right = 1
// Output: [5]

