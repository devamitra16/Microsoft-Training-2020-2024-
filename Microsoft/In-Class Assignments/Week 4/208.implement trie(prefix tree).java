class Trie {
    Node root;
    class Node{
        Node[] arr;
        boolean end;
        public Node(){
            arr=new Node[26];
            end=false;
        }
    }
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char curr=word.charAt(i);
            if(temp.arr[curr-'a']==null){
                temp.arr[curr-'a']=new Node();
            }
            temp=temp.arr[curr-'a'];
        }
        temp.end=true;
    }
    
    public boolean search(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char curr=word.charAt(i);
            if(temp.arr[curr-'a']==null){
                return false;
            }
            temp=temp.arr[curr-'a'];
        }
        return temp.end==true;
    }
    
    public boolean startsWith(String prefix) {
        Node temp=root;
        for(int i=0;i<prefix.length();i++){
            char curr=prefix.charAt(i);
            if(temp.arr[curr-'a']==null){
                return false;
            }
            temp=temp.arr[curr-'a'];
        }
        return true;
    }
}
