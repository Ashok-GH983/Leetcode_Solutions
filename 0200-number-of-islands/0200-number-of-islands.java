class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int islands=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    dfs(i,j,grid,visited);
                    islands++;
                }
            }
        }
        return islands;
    }
    public static void dfs(int row,int col,char[][] grid,boolean visited[][])
    {
        int []dr={-1,1,0,0};
        int []dc={0,0,-1,1};
        visited[row][col]=true;
        for(int k=0;k<4;k++)
        {
            int newRow=row+dr[k];
            int newCol=col+dc[k];
            if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]=='1' && !visited[newRow][newCol])
            {
                dfs(newRow,newCol,grid,visited);
            }
        }
    }
}