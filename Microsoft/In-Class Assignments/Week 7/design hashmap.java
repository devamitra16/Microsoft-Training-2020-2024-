class MyHashMap {
    ArrayList<Node>[] arr; 
    class Node{
        int key;
        int val;
        public Node(int key,int val){
          this.key=key;
          this.val=val;
        }
    }
    public MyHashMap() {
        arr=new ArrayList[10001];
    }
    
    public void put(int key, int value) {
        int index=key/100;
        if(arr[index]==null){
            arr[index]=new ArrayList<Node>();
            arr[index].add(new Node(key,value));
            return;
        }else{
            for(Node e:arr[index]){
                if(e.key==key){
                    e.val=value;
                    return;
                }
            }
            arr[index].add(new Node(key,value));
        }
    }
    
    public int get(int key) {
        int index=key/100;
        if(arr[index]==null){
            return -1;
        }
        else{
            for(Node e:arr[index]){
                if(e.key==key){
                    return e.val;
                }
            }
            return -1;
        }
    }
    
    public void remove(int key) {
        int index=key/100;
        if(arr[index]==null){
            return;
        }
            for(Node e:arr[index]){
                if(e.key==key){
                    arr[index].remove(e);
                    return;
                }
            }
        
    }
}
