class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int minNums[]=new int[n];
        minNums[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            minNums[i]=Math.min(nums[i],minNums[i+1]);
        }
        int max=-1;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,nums[i]);
            if(max-minNums[i]<=k)
            {
                return i;
            }
        }
        return -1;
    }
}