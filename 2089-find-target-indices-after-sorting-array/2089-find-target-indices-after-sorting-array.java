class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int start=-1;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                start=mid;
                high=mid-1;
            }
            else if (nums[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int end=-1;
        low=0;
        high=n-1;
        if(start!=-1)
        {
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(nums[mid]==target)
                {
                    end=mid;
                    low=mid+1;
                }
                else if(nums[mid]<target)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        else{
            return new ArrayList<>();
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            arr.add(i);
        }
        return arr;
    }
}