package day14;

/***
 * 23.
 */

public class MergeKLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;//每次待处理的链表个数
        if(len==0)return null;


        while (len>1){
            int i=0;
            for ( i=0;i<len/2;i++){
                lists[i]=mergeTwoLists(lists[2*i],lists[2*i+1]);
            }
            if (len%2==1){
                lists[i]=lists[len-1];
                len++;
            }
            len/=2;

        }
        return lists[0];

    }
    public  ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode head = new ListNode(-1);
        ListNode prev = head;
        while(l1!=null||l2!=null){
            if(l1==null){
                prev.next = l2;
                return head.next;
            }
            if(l2==null){
                prev.next = l1;
                return head.next;
            }
            if(l1.val<l2.val){
                prev.next = l1;
                l1 = l1.next;
            }
            else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        return  head.next;
    }

}
