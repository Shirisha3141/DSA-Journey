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
        //int co=0;
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
           s=s.next;
           f=f.next.next;
        }
        ListNode p=null;
        while(s!=null){
            ListNode next=s.next;
            s.next=p;
            p=s;
            s=next;
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