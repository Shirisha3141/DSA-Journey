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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        int c=0;
        ListNode t=head;
        while(t!=null){
            c++;
            t=t.next;
        }
        ListNode p=null;
        t=head;
        while(c>n){
            p=t;
            t=t.next;
            c--;
        }
        ListNode ne=t.next;
        if(p==null|| t==head) return head.next;
        p.next=t.next;
        return head;

    }
}