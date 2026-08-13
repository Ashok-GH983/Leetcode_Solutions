class Solution {
    public static boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length(),c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(i<n/2 && isVowel(s.charAt(i)))
            {
                c1++;
            }
            else if(isVowel(s.charAt(i)))
            {
                c2++;
            }
        }
        return c1==c2?true:false;
    }
}