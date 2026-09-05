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
    public boolean isPalindrome(ListNode head) {
        int co=0;
        ListNode t=head;
        while(t!=null){
            co++;
            t=t.next;
        }
        t=head;
        int n=co/2;
        while(n-->0){
            t=t.next;
        }
        ListNode p=null;
        ListNode c=t;
        while(c!=null){
            ListNode next=c.next;
            c.next=p;
            p=c;
            c=next;
        }
        ListNode l=head;
        while(p!=null){
            if(l.val!=p.val){
                return false;
            }
            l=l.next;
            p=p.next;
        }
        return true;
    }
}