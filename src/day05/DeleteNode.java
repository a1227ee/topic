package day05;

import day01.ListNode;

public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head==null){
            return head;
        }
        ListNode listNode = new ListNode(0);
        listNode.next=head;

        ListNode pre=listNode;
        ListNode pro=head;

        while (pro!=null){
            if (pro.val==val){
                pro=pro.next;
            }else{
                pre.next=pro;
            }
        }
        return listNode.next;



    }

}
