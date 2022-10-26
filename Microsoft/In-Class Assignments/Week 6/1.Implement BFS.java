class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[V];
        visited[0]=true;
        q.add(0);
        ArrayList<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int s=q.poll();
            res.add(s);
            Iterator<Integer> i=adj.get(s).listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
        return res;
    }
}
