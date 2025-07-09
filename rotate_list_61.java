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

// (Best Approach)

class rotate_list_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        int length = 1;
        ListNode last = head;

        while(last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int skip = length - (k % length); // length - rotations
        ListNode newLast = head;

        for(int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}

// (Improved version of below code by making computaion fast)

class rotate_list_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        int length = getLength(head);
        k %= length;

        while(k-- > 0) {
            ListNode prev = null;
            ListNode node = head;

            while(node.next != null) {
                prev = node;
                node = node.next;
            }
            
            node.next = head;
            head = node;
            prev.next = null;
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

// (Not Recommended) Tinme limit exceeds

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        while(k-- > 0) {
            ListNode prev = null;
            ListNode node = head;

            while(node.next != null) {
                prev = node;
                node = node.next;
            }
            
            node.next = head;
            head = node;
            prev.next = null;
        }

        return head;
    }
}


// Example 1:

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
  
// Example 2:

// Input: head = [0,1,2], k = 4
// Output: [2,0,1]

