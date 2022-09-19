class MyCircularQueue {
    int[] q;
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
            
        }else{
            return false;
        }
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            front=(front+1)%q.length;
            len--;
            return true;
        }else{
            return false;
        }
    }
    
    public int Front() {
        return isEmpty()?-1:q[front];
    }
    
    public int Rear() {
        return isEmpty()?-1:q[rear];
    }
    
    public boolean isEmpty() {
        return len==0;
    }
    
    public boolean isFull() {
        return len==q.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
