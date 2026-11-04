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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=null;
        if(head!=null && head.next!=null)
            temp=head.next;
        ListNode prev=head;
        while(temp!=null)
        {
            if(prev.val==temp.val)
            {
                temp=temp.next;
                prev.next=temp;
               
            }
            else{
                prev=prev.next;
                temp=temp.next;
            }
        }
        return head;
    }
}