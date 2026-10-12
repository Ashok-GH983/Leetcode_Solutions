class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dist[][]=new int[n][m];
        Queue<int[]> pq=new LinkedList<>();
        int dr[]={-1,0,0,1};
        int dc[]={0,-1,1,0};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    pq.add(new int[]{i,j});
                }
                else{
                    dist[i][j]=-1;
                }
            }
        }
        while(!pq.isEmpty())
        {
            int []val=pq.poll();
            int r=val[0];
            int c=val[1];
            for(int i=0;i<4;i++)
            {
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && mat[nr][nc]==1 &&dist[nr][nc]==-1)
                {
                    dist[nr][nc]=dist[r][c]+1;
                    pq.add(new int[]{nr,nc});
                }
            }
        }
        return dist;
    }
}