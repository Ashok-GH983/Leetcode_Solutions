class Solution {
    static int dr[]={-1,1,0,0};
    static int dc[]={0,0,-1,1};
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(board,i,0);
            }
            if(board[i][m-1]=='O')
            {
                dfs(board,i,m-1);
            }
        }
        for(int j=0;j<m;j++)
        {
            if(board[0][j]=='O')
            {
                dfs(board,0,j);
            }
            if(board[n-1][j]=='O')
            {
                dfs(board,n-1,j);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='S')
                {
                    board[i][j]='O';
                }
                else if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
            }
        }
    }
    public static void dfs(char[][] board,int row,int col)
    {
        board[row][col]='S';
        for(int k=0;k<4;k++)
        {
            int nr=row+dr[k];
            int nc=col+dc[k];
            if(nr>=0 && nr<board.length && nc>=0 && nc<board[0].length
            && board[nr][nc]=='O')
            {
                dfs(board,nr,nc);
            }
        }
    }
}