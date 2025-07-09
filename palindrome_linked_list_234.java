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

class palindrome_linked_list_234 {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;

        ListNode node = head;
        ListNode mid = getMidNode(head);
        ListNode rev = reverseList(mid);

        while(rev != null) {
            if(node.val != rev.val) return false;

            node = node.next;
            rev = rev.next;
        };

        return true;
    }

    static ListNode reverseList(ListNode mid) {
        ListNode prev = null;
        ListNode pres = mid;
        ListNode next = pres.next;

        while(pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;

            if(next != null) next = next.next;
        }

        return prev;
    }

    static ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}


// Example 1:

// Input: head = [1,2,2,1]
// Output: true
  
// Example 2:

// Input: head = [1,2]
// Output: false

