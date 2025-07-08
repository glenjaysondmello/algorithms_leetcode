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

class merge_two_sorted_list_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dHead = new ListNode();
        ListNode node = dHead;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
                node = node.next;
            } else {
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
        }

        while(list1 != null) {
            node.next = list1;
            list1 = list1.next;
            node = node.next;
        }

        while(list2 != null) {
            node.next = list2;
            list2 = list2.next;
            node = node.next;
        }

        return dHead.next;
    }
}


// Example 1:

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

// Example 2:

// Input: list1 = [], list2 = []
// Output: []

// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]

