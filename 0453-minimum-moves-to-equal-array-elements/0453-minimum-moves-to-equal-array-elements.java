class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int sum=0,min=Integer.MAX_VALUE;
        for(int ele:nums)
        {
            sum+=ele;
            min=Math.min(min,ele);
        }
        return sum-n*min;
    }
}