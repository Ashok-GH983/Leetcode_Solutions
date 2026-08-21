class Solution {
    static int dr[]={-1,1,0,0};
    static int dc[]={0,0,-1,1};
    public int numEnclaves(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<m;i++)
        {
            if(grid[0][i]==1)
            {
                queue.add(new int[]{0,i});
            }
            if(grid[n-1][i]==1)
            {
                queue.add(new int[]{n-1,i});
            }
        }
        for(int i=0;i<n;i++)
        {
            if(grid[i][0]==1)
            {
                queue.add(new int[]{i,0});
            }
            if(grid[i][m-1]==1)
            {
                queue.add(new int[]{i,m-1});
            }
        }
        
        while(!queue.isEmpty())
        {
            int[] arr=queue.poll();
            int row=arr[0];
            int col=arr[1];
            grid[row][col]=0;
            for(int k=0;k<4;k++)
            {
                int nr=row+dr[k];
                int nc=col+dc[k];
                if(nr<n && nr>=0 && nc<m&& nc>=0 && grid[nr][nc]==1)
                {
                    grid[nr][nc]=0;
                    queue.add(new int[]{nr,nc});
                }
            }
        }
        int count=0;
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                if(grid[i][j]==1)
                {
                    count+=dfs(grid,i,j,n,m);
                }
            }
        }
        return count;
    }
    public static int  dfs(int[][] grid,int row,int col,int n,int m)
    {
        grid[row][col]=0;
        int area=1;
        for(int k=0;k<4;k++)
        {
            int nr=row+dr[k];
            int nc=col+dc[k];
            if(nr<n-1 && nr>=1 && nc<m-1&& nc>=1 && grid[nr][nc]==1)
            {
                area+=dfs(grid,nr,nc,n,m);
            }
        }
        return area;
    }
}