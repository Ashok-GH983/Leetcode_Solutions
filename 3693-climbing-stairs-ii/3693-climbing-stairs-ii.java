class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[]=new int[n];
        dp[0]=costs[0]+1;
        if(n>1)
        {
            dp[1]=Math.min(dp[0]+costs[1]+1,costs[1]+4);
        }
        if(n>2)
        {
            dp[2]=Math.min(costs[2]+9,Math.min(dp[1]+costs[2]+1,dp[0]+costs[2]+4));
        }
        for(int i=3;i<n;i++)
        {
            dp[i]=Math.min(costs[i]+dp[i-3]+9,Math.min(costs[i]+dp[i-2]+4,costs[i]+dp[i-1]+1));
        }
        return dp[n-1];
    }
}