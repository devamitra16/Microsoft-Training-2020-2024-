class MyCircularDeque {
    
    private class Node{
        int data;
        Node prev;
        Node next;
    public Node(int d){
       prev=null;
       next=null;
       this.data=d;
    }
    }
    final private Node head;
    final private Node tail;
    int size,len=0;
    public MyCircularDeque(int k) {
        size=k;
        head=new Node(-1);
        tail=new Node(-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public boolean insertFront(int value) {
        if(!isFull()){
            Node nn=new Node(value);
            nn.next=head.next;
            head.next.prev=nn;
            head.next=nn;
            nn.prev=head;
            len++;
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(!isFull()){
            Node nn=new Node(value);
            nn.prev=tail.prev;
            tail.prev.next=nn;
            nn.next=tail;
            tail.prev=nn;
            len++;
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(!isEmpty()){
            head.next=head.next.next;
            head.next.prev=head;
            len--;
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!isEmpty()){
            tail.prev=tail.prev.prev;
            tail.prev.next=tail;
            len--;
            return true;
        }
        return false;
    }
    
    public int getFront() {
        return !isEmpty()?head.next.data:-1;
    }
    
    public int getRear() {
        return !isEmpty()?tail.prev.data:-1;
    }
    
    public boolean isEmpty() {
        return len==0;
    }
    
    public boolean isFull() {
        return len==size;
    }
}


------------------------------------------------------------------------------------------------------------------------------------------------------------
 import java.util.ArrayDeque;
class MyCircularDeque {
     ArrayDeque<Integer> arrDeque;
     int arrSize=0;

    public MyCircularDeque(int k) {
        arrDeque=new ArrayDeque<Integer>(k);
        arrSize=k;
    }
    
    public boolean insertFront(int value) {
        if(!isFull()){
            arrDeque.addFirst(value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(!isFull()){
            arrDeque.addLast(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(!isEmpty()){
            arrDeque.removeFirst();
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!isEmpty()){
            arrDeque.removeLast();
            return true;
        }
        return false;
    }
    
    public int getFront() {
        return !isEmpty()?arrDeque.peekFirst():-1;
    }
    
    public int getRear() {
        return !isEmpty()?arrDeque.peekLast():-1;
        
    }
    
    public boolean isEmpty() {
        return arrDeque.size()==0;
    }
    
    public boolean isFull() {
        return arrDeque.size()==arrSize;
    }
}
