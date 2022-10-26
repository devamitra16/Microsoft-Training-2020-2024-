class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited=new boolean[V];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(visited,adj,i,res);
            }
        }
        return res;
    }
    public void dfs(boolean[] visited,ArrayList<ArrayList<Integer>> adj,int node,ArrayList<Integer> res){
        visited[node]=true;
        res.add(node);
        for(int i:adj.get(node)){
            if(!visited[i]){
                dfs(visited,adj,i,res);
            }
        }
    }
}
