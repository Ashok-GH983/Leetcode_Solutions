class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1==nums[i]){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
       int freq[]=new int[51];
        for(int i=0;i<nums.length;i++)
        {
           freq[nums[i]]++;
        }
        for(int i=sum;i<51;i++)
        {
            if(freq[sum]==0)
            {
                return sum;
            }
            sum++;
        }
        return sum;
    }
}