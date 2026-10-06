class Solution {
    public int compress(char[] chars) {
        int c=1;
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
            {
                c++;
            }
            else{
                sb.append(chars[i]);
                if(c>1)
                    sb.append(String.valueOf(c));
                c=1;
            }
        }
        sb.append(chars[i]);
        if(c>1)
            sb.append(String.valueOf(c));
        i=0;
        for(i=0;i<sb.length();i++)
        {
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}