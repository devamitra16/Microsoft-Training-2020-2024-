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
ListNode curr= head;
if(head==null)
{
return head;
}
ListNode curr2=head.next;
while(curr2!=null)
{
if(curr.val==curr2.val)
{
curr.next=curr2.next;
curr2=curr2.next;
}
else{
curr=curr2;
curr2=curr2.next;
}
}
return head;
}
}
