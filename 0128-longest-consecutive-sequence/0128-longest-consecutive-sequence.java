class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int max=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int count=1;
                int curr=num;
                while(set.contains(curr+1))
                {
                    count++;
                    curr=curr+1;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}