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

// Approach 1: Uses a HashSet for O(1) lookup to efficiently remove nodes whose values exist in the given array.
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        while(head != null && set.contains(head.val)) {
            head = head.next;
        }

        ListNode prev = null, pres = head, next = pres.next;

        while(pres != null) {
            if(set.contains(pres.val)) {
                prev.next = next;
            } else {
                prev = pres;
            }

            pres = next;
            if(next != null) next = next.next;
        }

        return head;
    }
}

// Approach 2: Uses a linear search (O(n) lookup) in the array for each node, resulting in less efficiency than the HashSet approach. (Time Complexity Exceeds)
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode prev = null;

        while(head != null) {
            if(isInArray(nums, head.val)) {
                head = head.next;
            } else {
                break;
            }
        }

        ListNode pres = head;
        ListNode next = pres.next;

        while(pres != null) {
            int val = pres.val;
            if(isInArray(nums, val)) {
                if(prev != null) prev.next = next;
            } else {
                prev = pres;
            }

            pres = next;
            if(next != null) next = next.next;
        }

        return head;
    }

    static boolean isInArray(int[] nums, int c) {
        for(int n : nums) {
            if(c == n) return true;
        }

        return false;
    } 
}

// Example 1:

// Input: nums = [1,2,3], head = [1,2,3,4,5]
// Output: [4,5]
// Explanation:
// Remove the nodes with values 1, 2, and 3.

// Example 2:

// Input: nums = [1], head = [1,2,1,2,1,2]
// Output: [2,2,2]
// Explanation:
// Remove the nodes with value 1.

// Example 3:

// Input: nums = [5], head = [1,2,3,4]
// Output: [1,2,3,4]
// Explanation:
// No node has value 5.

