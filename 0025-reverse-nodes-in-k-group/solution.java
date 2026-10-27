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
    public ListNode reverseKGroup(ListNode head, int k) {

     
        ListNode temp=head, nextNode=null, prevNode=null;
      //  ListNode kthNode=null;
       // int i=k;
        while(temp!=null){
            ListNode kthNode=findKthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null){
                    prevNode.next=temp;
                }
                break;
            }
            nextNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthNode;
            }else{
                prevNode.next=kthNode;
            }
            prevNode=temp;
            temp=nextNode;   
        }
        return head;
       
    }

    ListNode findKthNode(ListNode node, int k){
        int i=k-1;
        ListNode temp=node;
        while(temp!=null && i>0){
            temp=temp.next;
            i--;
        }
        return temp;
    }

    ListNode reverse(ListNode node){
        if(node==null || node.next==null){
            return node;
        }
        ListNode prev=null;
        ListNode cur=node;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }

}
