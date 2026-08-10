class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        //boolean[][] visited=new boolean[n][m];
        int islands=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j,grid);
                    islands++;
                }
            }
        }
        return islands;
    }
    public static void dfs(int row,int col,char[][] grid)
    {
        int []dr={-1,1,0,0};
        int []dc={0,0,-1,1};
        grid[row][col]='0';
        for(int k=0;k<4;k++)
        {
            int newRow=row+dr[k];
            int newCol=col+dc[k];
            if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]=='1')
            {
                dfs(newRow,newCol,grid);
            }
        }
    }
}