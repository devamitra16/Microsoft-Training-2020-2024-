//recursion

class Solution {
    
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


*********************************************************************************************************************************************************************
//Iterative

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited=new boolean[V];
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        visited[0]=true;
        stack.push(0);
        while(!stack.isEmpty()){
        int s=stack.pop();
        res.add(s);
        for(int i=adj.get(s).size()-1;i>=0;i--){
            int n=adj.get(s).get(i);
            if(!visited[n]){
                visited[n]=true;
                stack.push(n);
            }
        
        }
        }
        return res;
    }
}
