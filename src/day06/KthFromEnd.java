package day06;

import day01.ListNode;

public class KthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode next=head;
        for (int i=1;i<=k;i++){
            next=next.next;
        }
        while (next!=null){
            head=head.next;
            next=next.next;
        }
        return head;
    }
}
