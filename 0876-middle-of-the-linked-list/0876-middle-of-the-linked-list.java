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
    public ListNode middleNode(ListNode head) {
        ListNode t=head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        ListNode k=head;
        int n=c/2;
        while(n-->0){
          k=k.next;
        }
        return k;
    }
}