class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        int min=nums[0];
        while(low<=high)
        {
            if(nums[low]<nums[high])
            {
                return Math.min(min,nums[low]);
            }
            int mid=low+(high-low)/2;
            if(nums[mid]<=nums[high])
            {
                min=Math.min(nums[mid],min);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return min;
    }
}