class Solution {
    public int reverseDegree(String s) {
        int sum=0,k=1;
        for(char ch:s.toCharArray())
        {
            int num=123-ch;
            sum+=num*k;
            k++;
        }
        return sum;
    }
}