class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode n=head.next;
        head.next=swapPairs(head.next.next);
        n.next=head;
        return n;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Main.java:

 import java.util.*;
class Main {
  public static void main(String[] args) {
    LinkedList list=new LinkedList();
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
       list.createlinkedlist(sc.nextInt());
    }
    list.head=list.swapPairs(list.head);
    list.display(list.head);
  }
}


LinkedList.java:


import java.util.*;
public class LinkedList {
   Node head=null;
   class Node{
     int data;
     Node next;
     Node(int data){
       this.data=data;
       next=null;
     }
   }
  public void createlinkedlist(int data){
    Node nn=new Node(data);
    if(head==null){
      head=nn;
    }else{
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=nn;
    }
    
  }
  public Node swapPairs(Node head){
    
    if(head==null || head.next==null){
      return head;
    }
    Node n=head.next;
   head.next=swapPairs(n.next);
    n.next=head;
    head=n;
    return head;
    
  }
  public void display(Node temp){
    if(temp==null){
      System.out.println("Empty list");
    }else{
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
    }
  }
  
}
