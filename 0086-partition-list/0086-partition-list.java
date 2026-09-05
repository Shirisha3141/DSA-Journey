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
    public ListNode partition(ListNode head, int x) {
        ListNode sd=new ListNode(0);
        sd.next=head;
        ListNode gd=new ListNode(0);
        ListNode l=sd;
        ListNode g=gd;
        ListNode t=head;
        while(t!=null){
            if(t.val<x){
                l.next=t;
                l=l.next;
            }else{
                g.next=t;
                g=g.next;
            }
            t=t.next;
        }
        g.next=null;
        l.next=gd.next;
        return sd.next;
    }
}