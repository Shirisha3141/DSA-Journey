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
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Integer> m = new HashMap<>();

        ListNode t = head;

        while (t != null) {

            m.put(t, m.getOrDefault(t, 0) + 1);

            if (m.get(t) == 2) {
                return t;
            }

            t = t.next;
        }

        return null;
    }
}