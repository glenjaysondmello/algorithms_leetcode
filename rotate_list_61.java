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


// (Not Recommended)

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

