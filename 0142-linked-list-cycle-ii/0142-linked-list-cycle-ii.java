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
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                ListNode t1=head;
                while(t1!=slow)
                {
                    t1=t1.next;
                    slow=slow.next;
                }
                return t1;
            }
        }
        return null;
    }
}