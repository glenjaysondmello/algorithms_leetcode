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
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) return true;
        }

        return false;
    }
}


// Example 1:

// Input: head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

// Example 2:

// Input: head = [1,2], pos = 0
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

// Example 3:

// Input: head = [1], pos = -1
// Output: false
// Explanation: There is no cycle in the linked list.


// (For cycle length)

// public class Solution {
//     public int hasCycle(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;
//         int length = 0;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
            
//             if(fast == slow) {
//                 ListNode temp = slow;
            
//                 do {
//                     temp = temp.next;
//                     length++;
//                 } while(temp != slow);

//                 return length;
//             }
//         }
//         return length;
//     }
// }

