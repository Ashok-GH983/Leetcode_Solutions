class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length,i;
        int count=0,ele=0;
        for(i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                ele=nums[i];
            }
            else if(ele==nums[i])
                count++;
            else
                count--;
        }
        return ele;
    }
}