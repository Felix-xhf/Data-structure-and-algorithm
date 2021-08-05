package leetcode.链表;

import Utils.ListNode;

public class Main206 {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        ListNode curr = dummy;
        while(head != null){
            curr = head;
            head = head.next;
            curr.next = dummy;
            dummy = curr;
        }
        return dummy;
    }
}
