class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    fresh++;
                }
                else if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
            }
        }
        int minutes=0;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!q.isEmpty() && fresh>0)
        {
            int size=q.size();
            minutes++;
            for(int i=0;i<size;i++)
            {
                int []curr=q.poll();
                for(int k=0;k<4;k++)
                {
                    int row=curr[0]+dr[k];
                    int col=curr[1]+dc[k];
                    if(row>=0 && row<n && col>=0 && col<m && grid[row][col]==1)
                    {
                        fresh--;
                        grid[row][col]=2;
                        q.add(new int[]{row,col});
                    }
                }
            }
        }
        return fresh==0?minutes:-1;
    }
}