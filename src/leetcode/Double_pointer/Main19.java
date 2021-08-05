package leetcode.Double_pointer;

import Utils.ListNode;

public class Main19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode right = head;
        ListNode dummy = new ListNode(-1,head);
        ListNode left = dummy;

        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while(right != null){
            right = right.next;
            left = left.next;
        }


        left.next = left.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        ListNode listNode = Main19.removeNthFromEnd(listNode1, 5);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }
}
