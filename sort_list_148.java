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

// (using Merge sort)

class sort_list_148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode mid = getMiddleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeAndSortList(left, right);
    }

    static ListNode getMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prev != null) {
            prev.next = null;
        }

        return slow;
    }

    static ListNode mergeAndSortList(ListNode left, ListNode right) {
        ListNode dHead = new ListNode();
        ListNode node = dHead;

        while(left != null && right != null) {
            if(left.val < right.val) {
                node.next = left;
                left = left.next;
                node = node.next;
            } else {
                node.next = right;
                right = right.next;
                node = node.next;
            }
        }

        while(left != null) {
            node.next = left;
            left = left.next;
            node = node.next;
        }

        while(right != null) {
            node.next = right;
            right = right.next;
            node = node.next;
        }

        return dHead.next;
    }
}


// (Bubble Sort) not recommended

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        int size = getSize(head);
        int row = size - 1;
        int col = 0;

        return bubbleSort(head, row, col);
    }

    static ListNode bubbleSort(ListNode head, int row, int col) {
        if(row == 0) return head;

        ListNode first = getNode(col, head);
        ListNode second = getNode(col + 1, head);

        if(row > col) {
            if(first.val > second.val) {
                if(first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else {
                    ListNode prev = getNode(col - 1, head);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }

            return bubbleSort(head, row, col + 1);
        } else {
            return bubbleSort(head, row - 1, 0);
        }
    }

    static int getSize(ListNode head) {
        ListNode temp = head;
        int length = 0;

        while(temp != null) {
            temp = temp.next;
            length++;
        }

        return length;
    }

    static ListNode getNode(int index, ListNode head) {
        ListNode node = head;

        for(int i = 0; i < index; i++) {
            if(node == null) return null;
            
            node = node.next;
        }

        return node;
    }
}




// Example 1:

// Input: head = [4,2,1,3]
// Output: [1,2,3,4]
  
// Example 2:

// Input: head = [-1,5,3,4,0]
// Output: [-1,0,3,4,5]
  
// Example 3:

// Input: head = []
// Output: []


