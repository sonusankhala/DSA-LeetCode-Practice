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
    public ListNode removeElements(ListNode head, int val) {

     /*
        ListNode cur = new ListNode(0), temp=cur;

        cur.next=head;
        //ListNode prev = null;
        while (temp.next!= null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return cur.next;

        */

        if(head==null){
            return null;
        }
        head.next= removeElements(head.next,val);
        return head.val==val?head.next:head;

    }
}
