class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]=new boolean[rooms.size()];
        dfs(rooms,0,visited);
        for(int i=0;i<rooms.size();i++)
        {
            if(!visited[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void dfs(List<List<Integer>> rooms,int src,boolean[] visited)
    {
        visited[src]=true;
        for(int next:rooms.get(src))
        {
            if(!visited[next])
            {
                dfs(rooms,next,visited);
            }
        }
    }
}