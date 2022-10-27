class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }
       Queue<Node> q=new LinkedList<>();
       Map<Node,Node> map=new HashMap<>();
       map.put(node,new Node(node.val));
       q.add(node);
       while(!q.isEmpty()){
           Node curr=q.poll();
           for(Node ng:curr.neighbors){
               if(!map.containsKey(ng)){
                   q.add(ng);
                   map.put(ng,new Node(ng.val));
               }
               map.get(curr).neighbors.add(map.get(ng));
           }
       }
       return map.get(node);
    }
}
