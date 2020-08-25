package day06;

import day01.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode node = new ListNode(-1);
        ListNode temp=node;
        while (l1!=null || l2!=null){
            if (l1.val<l2.val){
                node.next=l1;
                l1=l1.next;
                node=node.next;
            }else{
                node.next=l2;
                l2=l2.next;
                node=node.next;
            }
        }
        while (l1!=null){
            node.next=l1;
            l1=l1.next;
            node=node.next;
        }
        while (l2!=null){
            node.next=l2;
            l2=l2.next;
            node=node.next;
        }
        node.next=null;
        return temp.next;
    }
}
