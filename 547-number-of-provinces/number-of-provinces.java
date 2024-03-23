class Solution {
    void dfs(int source, int [][]isConnected, boolean []visited){
        visited[source]=true;
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        while(!q.isEmpty()){
            int front=q.poll();
            for(int i=0; i<isConnected.length; i++){
                if(isConnected[front][i]==0 || visited[i]) continue;
                visited[i]=true;
                q.offer(i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int components=0;
        boolean visited[]=new boolean [isConnected.length];
        for(int i=0; i<isConnected.length; i++){
            if(visited[i]) continue;
            components++;
            dfs(i, isConnected, visited);
        }
        return components;
    }
}