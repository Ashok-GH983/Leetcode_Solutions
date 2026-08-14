class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        int indegree[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            graph.get(v).add(u);
        }
        int state[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(!dfs(i,state,graph))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean dfs(int node,int[] state,List<List<Integer>> graph)
    {
        state[node]=1;
        for(int n:graph.get(node))
        {
            if(state[n]==1)
            {
                return false;
            }
            if(state[n]==0)
            {
                if(!dfs(n,state,graph)){
                    return false;
                }
            }
        }
        state[node]=2;
        return true;
    }
}