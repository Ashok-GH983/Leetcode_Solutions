class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0,ans=0;
        int freq[]=new int[26];
        for(int right=0;right<s.length();right++)
        {
            int ch=s.charAt(right)-'a';
            freq[ch]++;
            while(freq[ch]>2)
            {
                int c=s.charAt(left)-'a';
                freq[c]--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}