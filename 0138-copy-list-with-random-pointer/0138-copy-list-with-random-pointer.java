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
    public Node csll(Node head)
    {
        if(head==null)
        {
            return null;
        }
        Node curr=new Node(head.val);
        curr.next=csll(head.next);
        return curr;
    }
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node head2=csll(head);
        Node h1=head;
        Node h2=head2;
        Node t1=h1.next;
        Node t2=h2.next;
        while(h1!=null)
        {
            h1.next=h2;
            h2.next=t1;
            h1=t1;
            if(t1!=null)
            t1=t1.next;
            h2=t2;
            if(t2!=null)
            t2=t2.next;
        }
        t1=head;
        t2=head2;
        while(t1!=null)
        {
            if(t1.random==null)
            {
                t2.random=null;
            }
            else{
                t2.random=t1.random.next;
            }
            t1=t2.next;
            if(t1!=null)
            t2=t1.next;
        }
        t1=head;
        t2=head2;
        while(t1!=null)
        {
            t1.next=t2.next;
            t1=t1.next;
            if(t1!=null)
            t2.next=t1.next;
            t2=t2.next;
        }
        return head2;
    }
}