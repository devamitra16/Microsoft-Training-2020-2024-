class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        List<Integer> ans=new ArrayList<>();
        if(detectcycle(adj,numCourses)){
           return ans.stream().mapToInt(Integer::intValue).toArray();
        }
        Stack<Integer> stack=new Stack<>();
        boolean[] visited=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                dfs(visited,stack,adj,i);
            }
        }
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    public void dfs(boolean[] visited,Stack<Integer> stack,List<List<Integer>> adj,int k){
        visited[k]=true;
        for(int i=0;i<adj.get(k).size();i++){
            if(!visited[adj.get(k).get(i)]){
               dfs(visited,stack,adj,adj.get(k).get(i));
            }
        }
        stack.push(k);
    }
    public boolean detectcycle(List<List<Integer>> adj,int n){
        int[] visited=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                if(detect(adj,visited,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean detect(List<List<Integer>> adj,int[] visited,int k){
        if(visited[k]==2){
            return true;
        }
        visited[k]=2;
        for(int i:adj.get(k))
        {
            if(visited[i]!=1){
                if(detect(adj,visited,i)){
                    return true;
                }
            }

        }
        visited[k]=1;
        return false;
    }

}
