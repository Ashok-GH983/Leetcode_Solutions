class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int count=0;
        String ans="";
        int low=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                count++;
            }
            while(count>k)
            {
                char c=s.charAt(low);
                if(c=='1')
                {
                    count--;
                }
                low++;
            }
            if(count==k)
            {
                while (s.charAt(low) == '0') {
                    low++;
                }
                String curr = s.substring(low, i + 1);
                if(ans.equals("")||curr.length()<ans.length()||(curr.length()==ans.length() && curr.compareTo(ans)<0))
                {
                    ans=curr;
                }
            }
        }
        return ans;
    }
}