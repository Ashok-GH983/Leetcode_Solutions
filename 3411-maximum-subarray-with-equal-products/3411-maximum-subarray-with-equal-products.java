class Solution {
    public long gcd(long a,long b)
    {
        while(b!=0)
        {
            long temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int max=1;
        for(int i=0;i<n;i++)
        {
            long prod=nums[i];
            long lcm=nums[i];
            long hcf=nums[i];
            for(int j=i+1;j<n;j++)
            {
                prod*=nums[j];
                hcf=gcd(hcf,nums[j]);
                lcm=(lcm/gcd(lcm,nums[j]))*nums[j];
                if(prod==lcm*hcf)
                {
                    max=Math.max(max,j-i+1);
                }
                else if(j-i+1>2)
                {
                    break;
                }
            }
        }
        return max;
    }
}