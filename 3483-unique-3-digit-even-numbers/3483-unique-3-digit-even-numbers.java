class Solution {
    public int totalNumbers(int[] digits) {
        int freq[]=new int[10];
        for(int i=0;i<digits.length;i++)
        {
            freq[digits[i]]++;
        }
        int count=0;
        for(int i=1;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                for(int k=0;k<=8;k+=2)
                {
                    int used[]=new int[10];
                    used[i]++;
                    used[j]++;
                    used[k]++;
                    boolean flag=true;
                    for(int d=0;d<10;d++)
                    {
                        if(used[d]>freq[d])
                        {
                            flag=false;
                            break;
                        }
                    }
                    if(flag)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}