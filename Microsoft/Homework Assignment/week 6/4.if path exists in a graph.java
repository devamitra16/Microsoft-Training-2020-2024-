class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int s=q.poll();
            if(s==destination){
                return true;
            }
            for(int i=0;i<adj.get(s).size();i++){
                int k=adj.get(s).get(i);
                if(!visited[k]){
                    visited[k]=true;
                    q.add(k);
                }
            }
        }
        return false;
    }
}
