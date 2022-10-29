class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        return helper(head,newHead);
    }
        public ListNode helper(ListNode head,ListNode newHead){
            if(head==null){
                return newHead;
            }
            
        else{
        ListNode next=head.next;
        head.next=newHead;
        return helper(next,head);
       

      
        
        }

       
    }
}
