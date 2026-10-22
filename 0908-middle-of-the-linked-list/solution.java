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

        int c=0;
        ListNode node=head;
        while(node!=null){
            c++;
            node=node.next;
        }
        int mid=(c/2)+1;
        ListNode temp=head;
        int x=1;
        while(temp!=null){
            if(x==mid){
                break;
            }
            x++;
            temp=temp.next;
        }
        return temp;
        
    }
}
