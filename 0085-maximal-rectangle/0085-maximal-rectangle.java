class Solution {
    public static int largestRectangle(int arr[])
    {
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        int max=0;
        for(int i=0;i<=n;i++)
        {
            int height=i==n?-1:arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>height){
                int val=arr[stack.pop()];
                int width=!stack.isEmpty()?stack.peek():-1;
                max=Math.max(max,val*(i-width-1));
            }
            stack.push(i);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int max=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[]=new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int digit=matrix[i][j]-'0';
                if(digit==0)
                {
                    arr[j]=0;
                }
                else{
                    arr[j]++;
                }
            }
            max=Math.max(max,largestRectangle(arr));
        }
        return max;
    }
}