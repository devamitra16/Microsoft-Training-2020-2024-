import java.util.*;
public class Main {
  
  static class node{
    int data;
    node prev;
    node next;
    public  node(int data){
      prev=null;
      next=null;
      this.data=data;
    }
  }
   static node head;
   static node tail;
  static int size,len=0;
  public static String MyCircularDeque(int k){
    size=k;
    head=new node(-1);
    tail=new node(-1);
    head.next=tail;
    tail.prev=head;
    return null;
  }
  public static boolean insertFront(int val){
    if(!isFull()){
    node nn=new node(val);
    nn.next=head.next;
    head.next.prev=nn;
    head.next=nn;
    nn.prev=head;
    len++;
    return true;
    }
    return false;
  }
  public static boolean insertLast(int val){
    if(!isFull()){
      node nn=new node(val);
      tail.prev.next=nn;
      nn.prev=tail.prev;
      nn.next=tail;
      tail.prev=nn;
      len++;
      return true;
    }
    return false;
  }
  public static boolean deleteFront(){
    if(!isEmpty()){
      head.next=head.next.next;
      head.next.prev=head;
      len--;
      return true;
    }
    return false;
  }
  public static boolean deleteLast(){
    if(!isEmpty()){
      tail.prev=tail.prev.prev;
      tail.prev.next=tail;
      len--;
      return true;
    }
    return false;
  }
  public static int getFront(){
    if(!isEmpty()){
      return head.next.data;
    }
    return -1;
  }
  public static int getRear(){
    return !isEmpty()?tail.prev.data:-1;
  }
  public static boolean isEmpty(){
    return len==0;
  }
  public static boolean isFull(){
    
    return len==size;
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] operation=new int[n];
      int[] value=new int[n];
      for(int i=0;i<n;i++){
        operation[i]=sc.nextInt();
      }
      for(int j=0;j<n;j++){
        value[j]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        int op=operation[i];
        switch(op){
             case 1:
             System.out.print(MyCircularDeque(value[i])+" ");
             break;
             case 2:
             System.out.print(insertFront(value[i])+" ");
             break;
             case 3:
             System.out.print(insertLast(value[i])+" ");
             break;
             case 4:
             System.out.print(deleteFront()+" ");
             break;
             case 5:
             System.out.print(deleteLast()+" ");
             break;
             case 6:
             System.out.print(getFront()+" ");
             break;
             case 7:
             System.out.print(getRear()+" ");
             break;
             case 8:
             System.out.print(isEmpty()+" ");
             break;
             case 9:
             System.out.print(isFull()+" ");
             break;
             
        }
      }
  }
}

