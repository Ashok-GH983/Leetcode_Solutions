class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid=new char[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(grid[i],'#');
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==m-1)
                {
                    grid[i][j]='.';
                }
            }
        }
        String sb[]=new String[m];
        for(int i=0;i<m;i++)
        {
            StringBuilder ans=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                ans.append(grid[i][j]);
            }
            sb[i]=ans.toString();
        }
        return sb;
    }
}