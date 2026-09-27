class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack =new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch!=')')
            {
                stack.push(ch);
            }
            else 
            {
                while(stack.peek()!='(')
                {
                    sb.append(stack.pop());
                }
                stack.pop();
                while(sb.length()!=0)
                {
                    stack.push(sb.charAt(0));
                    sb.deleteCharAt(0);
                }
            }
        }
        while(!stack.isEmpty())
        {
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}