/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
      //  int c=1;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            //c++;
            if(slow==fast){
               slow=head;
               while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
               }
               return slow;
            }
        }
    return null;
    
    /*
    Map<ListNode,Integer> map=new HashMap<>();
    ListNode temp=head;
    while(temp!=null){
        if(map.containsKey(temp)){
            return temp;
        }
        map.put(temp,1);
        temp=temp.next;
    }
    return null;
    */
    }

}
