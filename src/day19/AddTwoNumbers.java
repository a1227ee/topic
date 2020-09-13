package day19;

/**
 * @ClassName AddTwoNumbers
 * @Deacription: 2. 两数相加
 * @Author zzx
 * @Date 2020/9/2 17:54
 **/

public class AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode cur=node;
        int num=0;

        while (l1!=null || l2!=null || num!=0){
            int le=l1==null?0:l1.val;
            int ri=l2==null?0:l2.val;
            int sum=num+le+ri;
            ListNode listNode = new ListNode(sum%10);
            cur.next=listNode;
            cur=cur.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            num=sum/10;
        }

        return node.next;
    }
}
