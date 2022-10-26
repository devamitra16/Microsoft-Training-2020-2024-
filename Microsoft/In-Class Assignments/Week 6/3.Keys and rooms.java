//bfs 

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int s=q.poll();
            for(int i=0;i<rooms.get(s).size();i++){
                int k=rooms.get(s).get(i);
                if(!visited[k]){
                    visited[k]=true;
                    q.add(k);
                }
            }
        }
        for(boolean i:visited){
            if(!i){
                return false;
            }
        }
        return true;
    }
}

*******************************************************************************************************************************************************************
//dfs iterative

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        visited[0]=true;
        while(!stack.isEmpty()){
            int s=stack.pop();
            for(int i=0;i<rooms.get(s).size();i++){
                int v=rooms.get(s).get(i);
                if(!visited[v]){
                    visited[v]=true;
                    stack.push(v);
                }
            }
        }
        for(boolean i:visited){
            if(!i){
                return false;
            }
        }
        return true;
    }
}

******************************************************************************************************************************************************************

