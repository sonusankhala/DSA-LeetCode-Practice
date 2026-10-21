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

        int k=0;
        if(head==null){
            return null;
        }
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            k++;
        }
        return removeNthFromStrat(head,k-n+1);
    }

    ListNode removeNthFromStrat(ListNode head,int x){
        if(x==1){
            return head.next;
        }
        ListNode temp=head;
        ListNode prev=null;
        int c=0;
        while(temp!=null){
            c++;
            if(c==x){
              prev.next=prev.next.next;
              break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

}
