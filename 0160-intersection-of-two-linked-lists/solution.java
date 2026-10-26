/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       /*
       TC=O(n*2)
       ListNode first=headA;
       while(first!=null){
        ListNode second=headB;
        while(second!=null){
            if(first==second){
                return first;
            }
            second=second.next;
        }
        first=first.next;
       }
       return null;
       */

       /*

       HashSet<ListNode> visit=new HashSet<>();
       ListNode first=headA;
       while(first!=null){
        visit.add(first);
        first=first.next;
       }
       ListNode second=headB;
       while(second!=null){
        if(visit.contains(second)){
            return second;
        }
        second=second.next;
       }
       return null;
       */

       ListNode first=headA;
       ListNode second=headB;
       while(first!=second){
        first=(first==null)?headB:first.next;
        second=(second==null)?headA:second.next;
       }
       return first;
    }
}
