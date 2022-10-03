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
    final private Node front;
    final private Node rear;
    int size,len=0;
    public MyCircularDeque(int k) {
        size=k;
        front=new Node(-1);
        rear=new Node(-1);
        front.next=rear;
        rear.prev=front;
    }
    
    public boolean insertFront(int value) {
        if(!isFull()){
            Node nn=new Node(value);
            nn.next=front.next;
            front.next.prev=nn;
            front.next=nn;
            nn.prev=front;
            len++;
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(!isFull()){
            Node nn=new Node(value);
            nn.prev=rear.prev;
            rear.prev.next=nn;
            nn.next=rear;
            rear.prev=nn;
            len++;
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(!isEmpty()){
            front.next=front.next.next;
            front.next.prev=front;
            len--;
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!isEmpty()){
            rear.prev=rear.prev.prev;
            rear.prev.next=rear;
            len--;
            return true;
        }
        return false;
    }
    
    public int getFront() {
        return !isEmpty()?front.next.data:-1;
    }
    
    public int getRear() {
        return !isEmpty()?rear.prev.data:-1;
    }
    
    public boolean isEmpty() {
        return len==0;
    }
    
    public boolean isFull() {
        return len==size;
    }
}
