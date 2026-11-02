class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n=pattern.length();
        String[] words=s.split(" ");
        int wl=words.length;
        if(n!=wl)
        {
            return false;
        }
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            if(!map.containsKey(ch) && !map.containsValue(words[i]))
            {
                map.put(ch,words[i]);
            }
            else{
                if(map.containsKey(ch) && !(map.get(ch).equals(words[i])))
                {
                    return false;
                }
                else if(!map.containsKey(ch) && map.containsValue(words[i]))
                {
                    return false;
                }
            }

        }
        return true;
    }
}