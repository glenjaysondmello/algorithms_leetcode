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

class reorder_list_143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode mid = getMidNode(head);

        ListNode first = head;
        ListNode second = reverse(mid.next);
        mid.next = null;
        
        while(first != null && second != null) {
            ListNode temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }

    static ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static ListNode reverse(ListNode mid) {
        ListNode prev = null;
        ListNode pres = mid;
        ListNode next = mid.next;

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

// Input: head = [1,2,3,4]
// Output: [1,4,2,3]
  
// Example 2:

// Input: head = [1,2,3,4,5]
// Output: [1,5,2,4,3]

