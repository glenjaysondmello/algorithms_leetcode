/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class linked_list_cycle_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                ListNode temp = slow;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);

                break;
            }
        }

        if(length == 0) return null;

        ListNode f = head;
        ListNode s = head;

        while(length > 0) {
            s = s.next;
            length--;
        }

        while(f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }
}


// Example 1:

// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.
  
// Example 2:

// Input: head = [1,2], pos = 0
// Output: tail connects to node index 0
// Explanation: There is a cycle in the linked list, where tail connects to the first node.

// Example 3:

// Input: head = [1], pos = -1
// Output: no cycle
// Explanation: There is no cycle in the linked list.

