class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
        {
            return false;
        }
        int nums[]={2,3,5};
        for(int div:nums)
        {
            while(n%div==0)
            {
                n/=div;
            }
        }
        return n==1;
    }
}