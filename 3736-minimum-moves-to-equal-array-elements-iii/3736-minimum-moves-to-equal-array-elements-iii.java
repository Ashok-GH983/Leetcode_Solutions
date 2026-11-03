class Solution {
    public int minMoves(int[] nums) {
        int max=0,sum=0;
        for(int ele:nums)
        {
            max=Math.max(max,ele);
            sum+=ele;
        }
        
        return nums.length*max-sum;
    }
}