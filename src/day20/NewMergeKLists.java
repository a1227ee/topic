package day20;

import day01.ListNode;

/**
 * @ClassName NewMergeKLists
 * @Deacription:  K个链表合并
 * @Author zzx
 * @Date 2020/9/4 10:45
 **/

public class NewMergeKLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeLists(ListNode[] lists){
      if (lists ==null ){
        return null;
      }
      int len = lists.length;

      while (len>1){
        int i=0;
        for (i=0;i<len/2;i++){
          lists[i]=mergeTwoLists(lists[2*i+1],lists[2*i+2]);
        }
        if (len % 2 == 1){
          lists[i]=lists[len-1];
          len++;
        }
        len/=2;
      }
      return lists[0];
    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
      ListNode node = new ListNode(0);
      ListNode temp=node;
      while (l1==null || l2==null){
        if (l1.val<l2.val){
          temp.next=l1;
        }else{
          temp.next=l2;
        }
        temp=temp.next;
        l1=l1.next;
        l2=l2.next;
      }
      if (l1==null){
        temp.next=l2;
      }
      if (l2==null){
        temp.next=l1;
      }

      return node.next;
    }




}
