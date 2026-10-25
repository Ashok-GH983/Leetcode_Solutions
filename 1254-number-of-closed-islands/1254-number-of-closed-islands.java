class Solution {
    static int dr[]={-1,0,0,1};
    static int dc[]={0,-1,1,0};
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0 || j==0 || i==n-1 || j==m-1)&& grid[i][j]==0)
                {
                    dfs(i,j,grid);
                }
            }
        }
        int c=0;
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                if(grid[i][j]==0)
                {
                    c++;
                    dfs(i,j,grid);
                }
            }
        }
        return c;
    }
    public static void dfs(int r,int c,int [][]grid)
    {
        grid[r][c]=1;
        for(int k=0;k<4;k++)
        {
            int row=r+dr[k];
            int col=c+dc[k];
           if(row>=0 && col>=0 && row<=grid.length-1 && col<=grid[0].length-1 && grid[row][col]==0)
            {
                dfs(row,col,grid);
            }
        }
    }
}