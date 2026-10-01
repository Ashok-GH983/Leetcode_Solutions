class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows)
        {
            return s;
        }
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            sb[i]=new StringBuilder();
        }
        int pos=0;
        boolean flag=false;
        for(char ch:s.toCharArray())
        {
            sb[pos].append(ch);
            if(pos==0 ||pos==numRows-1)
            {
                flag=!flag;
            }
            if(flag)
            {
                pos++;
            }
            else{
                pos--;
            }
        }
        for(int i=1;i<numRows;i++)
        {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}