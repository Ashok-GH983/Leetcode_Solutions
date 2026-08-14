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
            indegree[u]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                queue.add(i);
            }
        }
        int count=0;
        while(!queue.isEmpty())
        {
            int x=queue.poll();
            count++;
            for(int n:graph.get(x))
            {
                indegree[n]--;
                if(indegree[n]==0)
                {
                    queue.add(n);
                }
            }
        }
        return count==numCourses;
    }
}