class Solution {
    public boolean uniformArray(int[] nums1) {
        int evenMin=Integer.MAX_VALUE,oddMin=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0)
            {
                evenMin=Math.min(evenMin,nums1[i]);
            }
            else{
                oddMin=Math.min(oddMin,nums1[i]);
            }
        }
        if(evenMin==Integer.MAX_VALUE || oddMin==Integer.MAX_VALUE)
            return true;
        return evenMin>oddMin?true:false;
    }
}