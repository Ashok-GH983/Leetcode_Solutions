class Solution {
    public int[] resultArray(int[] nums) {
        int arr[]=new int[nums.length];
        int l1=0;
        int l2=0;
        arr[0]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            if(nums[l1]>arr[l2])
            {
                l1++;
                nums[l1]=nums[i];
            }
            else{
                l2++;
                arr[l2]=nums[i];
            }
        }
        for(int i=0;i<=l2;i++)
        {
            l1++;
            nums[l1]=arr[i];
        }
        return nums;
    }
}