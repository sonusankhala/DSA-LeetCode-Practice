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

    ListNode findKthNode(ListNode head, int k){
       k-=1;
        ListNode temp=head;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;

    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
           //arr.add(temp.val);
           temp=temp.next;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        ListNode kthNode=findKthNode(head,n-k);
        ListNode nextNode=kthNode.next;
        kthNode.next=null;
        ListNode dum=nextNode;
        while(dum.next!=null){
            dum=dum.next;
        }
        ListNode tail=dum;
        tail.next=head;
        head=nextNode;

        return head;


        
        /*


        List<Integer> arr=new ArrayList<>();
        ListNode temp=head;
       // int i=0;
        while(temp!=null){
           // i++
           arr.add(temp.val);
           temp=temp.next;
        }

        int n=arr.size();
        k=k%n;
        System.out.println(n);

        RotateListBykthright(arr,0,n-k-1);
        RotateListBykthright(arr,n-k,n-1);
        RotateListBykthright(arr,0,n-1);
        ListNode newNode=new ListNode(arr.get(0));
        ListNode tempNew=newNode;
        for(int i=1;i<arr.size();i++){
            ListNode newhead=new ListNode(arr.get(i));
            tempNew.next=newhead;
            tempNew=newhead;
        }
        return newNode;
        */

        
    }

    void RotateListBykthright(List<Integer> arr, int start, int end){
        while(start<end){
            int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }

    }
}
