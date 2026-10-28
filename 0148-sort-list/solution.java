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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        ListNode node=new ListNode();
        ListNode dummy=node;
        for(int i=0;i<arr.size();i++){
            ListNode newNode=new ListNode(arr.get(i));
            node.next=newNode;
            node=newNode;
            // System.out.println(node.val);
        }

        return dummy.next;
        
    }
}
