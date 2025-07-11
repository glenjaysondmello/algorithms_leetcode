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
 
class reverse_nodes_in_k_group_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        int left = 1;
        int right = k;

        ListNode prev = null;
        ListNode pres = head;
        
        int j = 0;
        int length = getLength(head);

        while(right <= length && right % k == 0) {
            prev = null;
            pres = head;

            for(int i = 0; i < left - 1; i++) {
                prev = pres;
                pres = prev.next;
            }

            ListNode start = prev;
            ListNode end = pres;

            ListNode next = pres.next;

            for(int i = 0; i <= right - left; i++) {
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

            left += k;
            right += k;
        }

        return head;
    }

    static int getLength(ListNode node) {
        int length = 0;

        while(node != null) {
            node = node.next;
            length++;
        }

        return length;
    }
}


// Example 1:

// Input: head = [1,2,3,4,5], k = 2
// Output: [2,1,4,3,5]
  
// Example 2:

// Input: head = [1,2,3,4,5], k = 3
// Output: [3,2,1,4,5]

