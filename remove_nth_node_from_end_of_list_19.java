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

class remove_nth_node_from_end_of_list_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;

        int len = lengthOfList(head);
        int endN = len - n;

        if(endN < 0) return null;

        if(endN == 0) {
            head = head.next;
            return head;
        }

        int  i = 0;
        ListNode prev = null;
        ListNode node = head;

        while(i < endN && node != null) {
            prev = node;
            node = node.next;
            i++;
        }

        prev.next = node.next;

        return head;
    }

    static int lengthOfList(ListNode head) {
        int n = 0;
        ListNode temp = head;

        while(temp != null) {
            temp = temp.next;
            n++;
        }

        return n;
    }
}

// Example 1:

// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

// Example 2:

// Input: head = [1], n = 1
// Output: []

// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]

