class MyHashSet {
    ArrayList<Node>[] arr;
    public class Node{
        int val;
        public Node(int val){
            this.val=val;
        }
    }
    public MyHashSet() {
        arr=new ArrayList[10001];
    }
    
    public void add(int key) {
        int index=key/100;
        if(arr[index]==null){
            arr[index]=new ArrayList<Node>();
            arr[index].add(new Node(key));
        }else{
            for(Node e:arr[index]){
                if(e.val==key){
                    return;
                }
            }
            arr[index].add(new Node(key));
            return;
        }
    }
    
    public void remove(int key) {
       int index=key/100;
       if(arr[index]==null){
           return;
       } 
       for(Node e:arr[index]){
           if(e.val==key){
               arr[index].remove(e);
               return;
           }
       }
    }
    
    public boolean contains(int key) {
        int index=key/100;
        if(arr[index]==null){
            return false;
        }else{
            for(Node e:arr[index]){
                if(e.val==key){
                    return true;
                }
            }
        }
        return false;
    }
}
