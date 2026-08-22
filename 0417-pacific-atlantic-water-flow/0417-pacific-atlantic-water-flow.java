class Solution {
    static int dr[]={-1,1,0,0};
    static int dc[]={0,0,-1,1};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        boolean [][]pacific=new boolean[n][m];
        boolean [][]Atlantic=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            if(!pacific[i][0])
            {
                dfs(heights,i,0,pacific);
            }
            if(!Atlantic[i][m-1])
            {
                dfs(heights,i,m-1,Atlantic);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(!pacific[0][i])
            {
                dfs(heights,0,i,pacific);
            }
            if(!Atlantic[n-1][i])
            {
                dfs(heights,n-1,i,Atlantic);
            }
        }
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(pacific[i][j]&&Atlantic[i][j])
                {
                    arr.add(Arrays.asList(i, j));
                }
            }
        }
        return arr;
    }
    public static void dfs(int[][] heights,int row,int col,boolean visited[][])
    {
        visited[row][col]=true;
        for(int k=0;k<4;k++)
        {
            int nr=row+dr[k];
            int nc=col+dc[k];
            if(nr>=0 && nr<heights.length && nc>=0 && nc<heights[0].length
            && !visited[nr][nc] && heights[nr][nc]>=heights[row][col])
            {
                dfs(heights,nr,nc,visited);
            }
        }
    }
}