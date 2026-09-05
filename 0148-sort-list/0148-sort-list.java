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
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle node
        ListNode middle = findMiddle(head);

        // Split into two halves
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        // Recursively sort both halves
        left = sortList(left);
        right = sortList(right);

        // Merge sorted halves
        return mergeTwoSortedLinkedLists(left, right);
    }
    public ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
        // Create a dummy node
        ListNode dummyNode = new ListNode(-1);

        // Temp pointer to build merged list
        ListNode temp = dummyNode;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            // Choose smaller node
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            // Move temp pointer
            temp = temp.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        // Return head of merged list
        return dummyNode.next;
    }

    // Function to find middle of linked list
    public ListNode findMiddle(ListNode head) {
        // If list empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head.next;

        // Move fast twice as fast as slow
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Return middle node
        return slow;
    }

}