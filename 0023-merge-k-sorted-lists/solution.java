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
    public ListNode mergeKLists(ListNode[] lists) {
         if(lists.length<=0){
            return null;
        }

        if(lists.length==1){
            return lists[0];
        }
        ListNode list1=lists[0];
      //  ListNode list2=Lists[1];
        int n=lists.length-1;
        int i=1;
        while(i<=n){
       // ListNode list1=Lists[i];
        ListNode list2=lists[i];
        list1=mergerTwoSortedList(list1,list2);
        i++;
        //n--;
        }
        return list1;
    }

    ListNode mergerTwoSortedList(ListNode list1, ListNode list2){
        ListNode dummy=new ListNode();
        ListNode head=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                head.next=list1;
                list1=list1.next;
            }else{
                head.next=list2;
                list2=list2.next;
            }
            head=head.next;
        }
        head.next=list1!=null?list1:list2;

        return dummy.next;
    }
}
