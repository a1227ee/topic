package day16;


import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName
 * @Deacription: LRU缓存机制
 * @Author zzx
 * @Date 2020/8/30 17:45
 **/

public class LRUCache {
    class Node{
        int val;
        int key;
        Node next;
        Node pre;
        public Node(){};
        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    private int size;
    private int capacity;
    Node head;
    Node tail;
    Map<Integer, Node> map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map = new HashMap<>(capacity);
        head = new Node();
        tail = new Node();
        head.next=tail;
        tail.pre=head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node==null){
            return -1;
        }
        Node pre = node.pre;
        Node next = node.next;
        pre.next=next;
        next.pre=pre;

        Node next1 = head.next;
        head.next=node;
        node.pre=head;
        node.next=next1;
        next1.pre=node;


        return node.val;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null){
            Node newNode = new Node(key, value);
            map.put(key,newNode);
            Node oldnext = head.next;
            head.next=newNode;
            newNode.pre=head;
            oldnext.pre=newNode;
            newNode.next=oldnext;

            ++size;

            if (size>capacity){
                Node pre = tail.pre;

                Node pre1 = pre.pre;

                pre1.next=tail;
                tail.pre=pre1;

                map.remove(pre.key);
                size--;
            }
        }else{
            Node pre = node.pre;
            Node next = node.next;
            pre.next=next;
            next.pre=pre;
            Node node1 = new Node(key, value);
            map.put(key,node1);
            Node next1 = head.next;
            head.next=node1;
            node1.pre=head;

            node1.next=next1;
            next1.pre=node1;

        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2  );
        cache.put(2,1);
        cache.put(2,2);
        System.out.println(cache.get(2));
        cache.put(1, 1);    // 该操作会使得关键字 2 作废

        cache.put(4, 1);    // 该操作会使得关键字 1 作废
        System.out.println(cache.get(2));


    }

}
