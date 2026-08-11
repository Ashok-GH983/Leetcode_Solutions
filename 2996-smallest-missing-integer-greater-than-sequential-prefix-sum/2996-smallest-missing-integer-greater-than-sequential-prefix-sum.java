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
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(sum))
            {
                return sum;
            }
            sum+=1;
        }
        return sum;
    }
}