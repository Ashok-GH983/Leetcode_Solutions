class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);
        if(!set.contains(endWord))
        {
            return 0;
        }
        Queue<String> queue=new LinkedList<>();
        int level=1;
        queue.add(beginWord);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                String word=queue.poll();
                if(word.equals(endWord))
                {
                    return level;
                }
                char[] arr=word.toCharArray();
                for(int j=0;j<arr.length;j++)
                {
                    char org=arr[j];
                    for(char ch='a';ch<='z';ch++)
                    {
                        arr[j]=ch;
                        String next=new String(arr);
                        if(set.contains(next))
                        {
                            set.remove(next);
                            queue.add(next);
                        }
                    }
                    arr[j]=org;              
                }
            }
            level++;
        }
        return 0;
    }
}