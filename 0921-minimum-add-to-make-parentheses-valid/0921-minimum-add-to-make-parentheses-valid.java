class Solution {
    public int minAddToMakeValid(String s) {
        if(s=="")
        {
            return 0;
        }
        int c=0,ans=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                c++;
            }
            else{
                if(c>0)
                    c--;
                else
                  ans++;
            }
        }
        return ans+c;
    }
}