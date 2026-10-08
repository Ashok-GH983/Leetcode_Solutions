class Solution {
    public String removeOuterParentheses(String s) {
        int level=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                if(level>0)
                {
                    sb.append('(');
                }
                level++;
            }
            else{
                level--;
                if(level>0)
                {
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}