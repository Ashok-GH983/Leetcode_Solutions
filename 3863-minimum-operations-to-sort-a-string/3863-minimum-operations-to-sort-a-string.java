class Solution {
    public int minOperations(String s) {
        int n=s.length(),c=0;
        if(n==1)
            return 0;
        if(n==2 && s.charAt(0)>s.charAt(1))
        {
            return -1;
        }
        boolean sorted=true;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)>s.charAt(i+1))
            {
               sorted=false;   
                break;
            }
        }
        if(sorted) return 0;
        char min='z';
        char max='a';
        for(char a:s.toCharArray())
        {
            if(a<min)
            {
                min=a;
            }
            if(a>max)
            {
                max=a;
            }
        }
        int minc=0,maxc=0;
        for(char a:s.toCharArray())
        {
            if(a==min)
            {
                minc++;
            }
            if(a==max)
            {
                maxc++;
            }
        }

        int count=0;
        for(char a:s.toCharArray())
        {
            if(a==max)
            {
                count++;
            }
        }
        if(s.charAt(0)==min || s.charAt(n-1)==max)
            return 1;
        if(s.charAt(0)==max && s.charAt(n-1)==min && minc==1 && maxc==1)
        {
            return 3;
        }
        return 2;
    }
}