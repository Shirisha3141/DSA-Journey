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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode r=new ListNode(0);
        ListNode t=r;
        int c=0;
        while(c1!=null || c2!=null || c!=0){
            int sum=c;
            if(c1!=null){
                sum+=c1.val;
            c1=c1.next;
            }
            if(c2!=null){
                sum+=c2.val;
            c2=c2.next;
            }
            t.next=new ListNode(sum%10);
            t=t.next;
            c=sum/10;

        }
        return r.next;
    }
}