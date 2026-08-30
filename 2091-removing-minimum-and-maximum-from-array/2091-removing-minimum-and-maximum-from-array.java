class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE,minpos=0;
        int max=Integer.MIN_VALUE,maxpos=0;
        int n=nums.length;
        if(n==1)
        {
            return 1;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                minpos=i+1;
            }
            if(nums[i]>max)
            {
                max=nums[i];
                maxpos=i+1;
            }
        }
        int ans=Math.min(Math.min(minpos+(n-maxpos+1),maxpos+(n-minpos+1)),(Math.min(Math.max(minpos,maxpos),Math.max(n-minpos+1,n-maxpos+1))));
        return ans;
    }
}