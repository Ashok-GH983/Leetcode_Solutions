class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        if(image[sr][sc]==color)
        {
            return image;
        }
        int originalColour=image[sr][sc];
        dfs(image,sr,sc,color,originalColour);
        return image;
    }
    public static void dfs(int[][] image,int sr,int sc,int color,int originalColour)
    {
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};

        image[sr][sc]=color;
        for(int k=0;k<4;k++)
        {
            int newRow=sr+dr[k];
            int newCol=sc+dc[k];
            if(newRow>=0 && newRow<image.length
                && newCol>=0 && newCol<image[0].length
                && image[newRow][newCol]==originalColour)
                {
                    dfs(image,newRow,newCol,color,originalColour);
                }
        }
    }
}