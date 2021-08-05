package leetcode.链表;

import Utils.ListNode;

public class Main21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2== null){
            return l1;
        }

        ListNode dummy = new ListNode(-1,null);
        ListNode head = dummy;

        while(l1 != null && l2 != null){
            if (l1.val > l2.val){
                dummy.next = l2;
                l2 = l2.next;
                dummy = dummy.next;
            }else{
                dummy.next = l1;
                l1 = l1.next;
                dummy = dummy.next;
            }
        }

        while(l1!=null){
            dummy.next = l1;
            l1 = l1.next;
            dummy = dummy.next;
        }

        while(l2!=null){
            dummy.next = l2;
            l2 = l2.next;
            dummy = dummy.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Main21 main21 = new Main21();
        ListNode head = new ListNode(1,null);
        ListNode head2 = new ListNode(2,null);
        ListNode head3 = new ListNode(4,null);
        head.next = head2;
        head2.next = head3;

        ListNode head1 = new ListNode(1,null);
        ListNode head12 = new ListNode(3,null);
        ListNode head13 = new ListNode(4,null);
        head1.next = head12;
        head12.next = head13;

        ListNode listNode = main21.mergeTwoLists(head, head1);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
