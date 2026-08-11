class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    int area=dfs(grid,i,j);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
    public static int dfs(int[][] grid,int row,int col)
    {
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        grid[row][col]=0;
        int area=1;
        for(int k=0;k<4;k++)
        {
            int nrow=row+dr[k];
            int ncol=col+dc[k];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==1)
            {
                area+=dfs(grid,nrow,ncol);
            }
        }
        return area;
    }
}