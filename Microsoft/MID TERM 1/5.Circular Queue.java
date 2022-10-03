class MyCircularQueue {
    int q[];
    int front=0,rear=-1,len=0;
    public MyCircularQueue(int k) {
        q=new int[k];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
          rear=(rear+1)%q.length;
          q[rear]=value;
          len++;
          return true;
        }
        return false;
    }
    
    public boolean deQueue() {
       if(!isEmpty()){
           front=(front+1)%q.length;
           len--;
           return true;
       } 
       return false;
    }
    
    public int Front() {
        return !isEmpty()?q[front]:-1;
    }
    
    public int Rear() {
        return !isEmpty()?q[rear]:-1;
    }
    
    public boolean isEmpty() {
        return len==0;
    }
    
    public boolean isFull() {
        return len==q.length;
    }
}
