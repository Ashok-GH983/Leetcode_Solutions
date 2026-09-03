class Solution {
    public boolean uniformArray(int[] nums1) {
        int evenMax=Integer.MAX_VALUE,oddMin=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0)
            {
                evenMax=Math.min(evenMax,nums1[i]);
            }
            else{
                oddMin=Math.min(oddMin,nums1[i]);
            }
        }
        if(evenMax==Integer.MAX_VALUE || oddMin==Integer.MAX_VALUE)
            return true;
        return evenMax>oddMin?true:false;
    }
}