class Pair
{
    int edge;
    int cost;
    Pair(int edge,int cost)
    {
        this.edge=edge;
        this.cost=cost;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            graph.add(new ArrayList<>());
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        for(int i=1;i<=times.length;i++)
        {
            int u=times[i-1][0];
            int v=times[i-1][1];
            int cost=times[i-1][2];
            graph.get(u).add(new Pair(v,cost));
        }
        int dist[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[k]=0;
        pq.add(new Pair(k,0));
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int u=p.edge;
            int cost=p.cost;
            for(Pair next:graph.get(u))
            {
                int adjnode=next.edge;
                int newCost=cost+next.cost;
                if(newCost<dist[adjnode])
                {
                    dist[adjnode]=newCost;
                    pq.add(new Pair(adjnode,newCost));
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)
            {
                return -1;
            }
            max=Math.max(max,dist[i]);
        }
        return max;
    }
}