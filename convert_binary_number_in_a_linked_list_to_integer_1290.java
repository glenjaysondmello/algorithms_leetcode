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
 
class convert_binary_number_in_a_linked_list_to_integer_1290 {
    public int getDecimalValue(ListNode head) {
        int res = 0;
        ListNode temp = head;
        int i = getLength(head) - 1;

        while(i >= 0) {
            int value = temp.val;
            res += value * Math.pow(2, i);
            temp = temp.next;
            i--;
        }

        return res;
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

// Input: head = [1,0,1]
// Output: 5
// Explanation: (101) in base 2 = (5) in base 10

// Example 2:

// Input: head = [0]
// Output: 0

