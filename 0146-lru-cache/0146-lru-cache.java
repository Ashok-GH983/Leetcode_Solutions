class LRUCache {
    class Node{
        int key;
        int data;
        Node prev;
        Node next;
        Node(int key,int data)
        {
            this.key=key;
            this.data=data;
        }
    }
    Node dummy=new Node(-1,-1);
    Node tail=dummy;
    Map<Integer,Node> map;
    int c=0;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        c=capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        else{
            Node x=map.get(key);
            if(x.next!=null)
            {
                x.prev.next=x.next;
                x.next.prev=x.prev;
                x.next=null;
                x.prev=tail;
                tail.next=x;
                tail=tail.next;
            }
            return x.data;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node x=map.get(key);
            x.data=value;
            if(x.next!=null)
            {
                x.prev.next=x.next;
                x.next.prev=x.prev;
                x.next=null;
                x.prev=tail;
                tail.next=x;
                tail=tail.next;
            }
        }
        else if (!map.containsKey(key) && map.size()!=c)
        {
            Node n=new Node(key,value);
            tail.next=n;
            n.prev=tail;
            tail=tail.next;
            map.put(key,n);
        }
        else{
            Node x = dummy.next;
            map.remove(x.key);
            x.prev.next = x.next;
            if (x.next != null) {
                x.next.prev = dummy;
            }
            if (tail == x) {
                tail = dummy;
            }
            Node n = new Node(key, value);
            map.put(key, n);
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */