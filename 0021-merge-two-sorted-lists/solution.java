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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       // TreeSet<Integer> set = new TreeSet<>();
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode head = new ListNode(0);
        ListNode ans=head;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
               // ListNode node = new ListNode(head1.val);
                head.next = head1;
                //head = node;
                head1 = head1.next;
            } else {

              //  ListNode node = new ListNode(head2.val);
                head.next = head2;
               // head = node;
                head2 = head2.next;
            }
            head=head.next;
        }
       
       head.next=(head1!=null)?head1:head2;

        return ans.next;

    }
}
