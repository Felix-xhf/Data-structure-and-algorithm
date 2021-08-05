package leetcode.Double_pointer;

import Utils.ListNode;

public class Main876 {
    public ListNode middleNode(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        while(right.next!=null){
            if (right.next.next==null){
                return left.next;
            }
            left = left.next;
            right = right.next.next;
        }
        return left;
    }
}
