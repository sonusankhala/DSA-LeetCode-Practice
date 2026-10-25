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

        if(head==null || head.next==null){
            return true;
        }
  // with O(n) SC
  /*
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int l=0, r=arr.size()-1;
        while(l<=r){
            if(arr.get(l)!=arr.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

        */

     // with O(1) SC

     ListNode slow=head;
     ListNode fast=head;
     //temp1=reverse(temp1);
     while(slow!=null && fast!=null && fast.next!=null){
        
        slow=slow.next;
        fast=fast.next.next;
     }
     ListNode secondhalf=reverse(slow);
     ListNode firsthalf=head;
     ListNode reverserd=secondhalf;
     while(reverserd!=null ){
        if(reverserd.val!=firsthalf.val){
            return false;
        }
        firsthalf=firsthalf.next;
        reverserd=reverserd.next;
     }
     return true;
    }

    static ListNode reverse(ListNode temp){
        if(temp==null || temp.next==null){
            return temp;
        }
        ListNode prev=null;
        ListNode cur=temp;
        while(cur!=null){
            ListNode dum=cur.next;
            cur.next=prev;
            prev=cur;
            cur=dum;
        }
        return prev;
    }
}
