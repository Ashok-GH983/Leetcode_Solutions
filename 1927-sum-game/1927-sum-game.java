class Solution {
    public boolean sumGame(String num) {
        int q=0,sum=0;
        int n=num.length();
        for(int i=0;i<n/2;i++)
        {
            if(num.charAt(i)=='?')
            {
                q++;
            }
            else{
                sum+=num.charAt(i)-'0';
            }
        }
        for(int i=n/2;i<n;i++)
        {
            if(num.charAt(i)=='?')
            {
                q--;
            }
            else{
                sum-=num.charAt(i)-'0';
            }
        }
        return 2*sum!=-9*q;
    }
}