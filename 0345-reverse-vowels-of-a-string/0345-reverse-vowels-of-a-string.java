class Solution {
    public static boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
        ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char []c=s.toCharArray();
        while(i<j)
        {
            while(i<j)
            {
                char ch=c[i];
                if(isVowel(ch))
                {
                    break;
                }
                i++;
            }
            while(i<j)
            {
                char ch=c[j];
                if(isVowel(ch))
                {
                    break;
                }
                j--;
            }
            if(i<j)
            {
                char ch=c[i];
                c[i]=c[j];
                c[j]=ch;
                i++;
                j--;
            }
        }
        return new String(c);
    }
}