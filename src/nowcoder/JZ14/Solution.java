package nowcoder.JZ14;

import Utils.ListNode;

public class Solution {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if (pHead== null){
            return null;
        }
        ListNode first = pHead;
        ListNode second = pHead;

        while(first!=null && k>0){
            first = first.next;
            k--;
        }

        if (k>0){
            return null;
        }

        while(first!=null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
