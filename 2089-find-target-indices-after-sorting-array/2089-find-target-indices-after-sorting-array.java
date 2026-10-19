class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int left=0,tc=0;
        for(int num:nums)
        {
            if(num<target)
            {
                left++;
            }
            else if(num==target)
            {
                tc++;
            }
        }
        for(int i=0;i<tc;i++)
        {
            arr.add(left+i);
        }
        return arr;
    }
}