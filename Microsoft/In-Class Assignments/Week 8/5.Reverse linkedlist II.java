class Solution {
    ListNode newHead=null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right){
            return head;
        }
        int i=1;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        while(i<(left)){
           dummy=dummy.next;
           i++;
        }
      
       ListNode temp=head;
       i=1;
       while(i<=right){
          temp=temp.next;
          i++;
       }
       newHead=temp;
       
       dummy.next=reverse(dummy.next,right-left+1);
     
       return left==1?newHead:head;


    }
    public ListNode reverse(ListNode head,int count){
         if(head==null || count<=0){
             return newHead;
         }
         ListNode next=head.next;
         head.next=newHead;
         newHead=head;
         return reverse(next,--count);

    }
}
