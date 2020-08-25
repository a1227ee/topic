package day01;

public class Reverse {

    public ListNode reverseList(ListNode head) {

        ListNode pre=null;
        ListNode pro=head;

        while (pro!=null){
            ListNode temp=pro.next;
            pro.next=pre;
            pre=pro;
            pro=temp;
        }

        return pre;
    }
}
