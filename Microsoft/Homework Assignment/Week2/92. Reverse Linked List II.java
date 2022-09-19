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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || (left==right)){
            return head;
        }
       ListNode temp;
        if(left != 1){
        temp=head;
        }else{
             temp=null;
        }   
        int count=1,flag=0;
        ListNode newHead=null;
        while(count<(left-1)){
           temp=temp.next; 
            count++;
        }
        count=left;
        ListNode start;
        if(temp==null){
            start=head;
        }else{
        start=temp.next;
        } 
        while(count<=right ){
           
            ListNode next=start.next;
            start.next=newHead;
            newHead=start;
            start=next;
            count++;
            
        }
        if(temp==null && start == null){
            return newHead;
        }else if(temp!=null && start!=null){
        temp.next.next=start;
        temp.next=newHead;
        return head;
        }else if(temp!=null && start==null){
            temp.next=newHead;
            return head;
        }
        else{
            head.next=start;
            return newHead;
        }
        
    }
}
