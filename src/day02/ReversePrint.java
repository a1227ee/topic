package day02;

import day01.ListNode;

import java.util.ArrayList;


public class ReversePrint {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] ints = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            ints[i]=tmp.get(i);
        }
        return ints  ;
    }
    void recur(ListNode head){
        if (head==null)return;
        recur(head.next);
        tmp.add(head.val);
    }
}
