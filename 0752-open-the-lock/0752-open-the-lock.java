class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead=new HashSet<>(Arrays.asList(deadends));
        Set<String> visited=new HashSet<>();
        if(dead.contains("0000"))
        {
            return -1;
        }
        Queue<String> q=new LinkedList<>();
        int steps=0;
        q.add("0000");
        visited.add("0000");
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                String s=q.poll();
                if(s.equals(target))
                {
                    return steps;
                }
                char arr[]=s.toCharArray();
                for(int k=0;k<4;k++)
                {
                    char original=arr[k];
                    arr[k]=original=='9'?'0':(char)(original+1);
                    String next=new String(arr);
                    if(!dead.contains(next) && !visited.contains(next))
                    {
                        q.add(next);
                        visited.add(next);
                    }
                    arr[k]=original=='0'?'9':(char)(original-1);
                    next=new String(arr);
                    if(!dead.contains(next) && !visited.contains(next))
                    {
                        q.add(next);
                        visited.add(next);
                    }

                    arr[k]=original;
                }
            }
            steps++;
        }
        return -1;
    }
}