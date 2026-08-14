class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0,ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2)
            {
                char c=s.charAt(left);
                map.put(c,map.get(c)-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}