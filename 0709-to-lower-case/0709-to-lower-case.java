class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++)
        {
            if(Character.isUpperCase(sb.charAt(i)))
            {
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
}