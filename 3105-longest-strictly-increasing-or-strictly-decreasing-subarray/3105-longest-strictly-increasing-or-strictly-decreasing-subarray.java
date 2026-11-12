class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int c1=1,c2=1;
        int c1max=1,c2max=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                c1++;
                c1max=Math.max(c1,c1max);
            }
            else{
                c1=1;
            }

            if(nums[i]<nums[i-1])
            {
                c2++;
                c2max=Math.max(c2max,c2);
            }
            else{
                c2=1;
            }
        }
        return Math.max(c1max,c2max);
    }
}