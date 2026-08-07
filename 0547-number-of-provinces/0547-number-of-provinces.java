class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(!visited[i]){
                dfs(i,isConnected,visited);
                c++;
            }
        }
        return c;
    }
    public static void dfs(int src,int [][]isConnected,boolean []visited)
    {
        visited[src]=true;
        for(int j=0;j<isConnected.length;j++)
        {
            if(isConnected[src][j]==1 && !visited[j])
            {
                dfs(j,isConnected,visited);
            }
        }
    }
}