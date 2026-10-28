/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    void insertCopy(Node head){
        Node temp=head;
        while(temp!=null){
            Node nextNode=temp.next;
            Node copy=new Node(temp.val);
            copy.next=nextNode;
            temp.next=copy;
            temp=nextNode;
        }
    }
    void connectRandom(Node head){
        Node temp=head;
        while(temp!=null){
            Node copy=temp.next;
            if(temp.random!=null){
                copy.random=temp.random.next;
            }else{
                copy.random=null;
            }
            temp=temp.next.next;
        }
    }

    Node extractCopy(Node head){
        Node temp=head;
        Node cur=new Node(-1);
        Node ans=cur;
        while(temp!=null){
            cur.next=temp.next;
            cur=cur.next;
            
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return ans.next;

    }
    public Node copyRandomList(Node head) {
        insertCopy(head);
        connectRandom(head);
        return extractCopy(head);
    }
}
