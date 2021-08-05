package nowcoder.JZ3;

import Utils.ListNode;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> tempList = new ArrayList<>();
        ListNode currentNode = listNode;

        while(currentNode != null){
            tempList.add(currentNode.val);
            currentNode = currentNode.next;
        }

        //翻转
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = tempList.size()-1;i>=0;i--){
            res.add(tempList.get(i));
        }
        return res;
    }

    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        if (listNode == null){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        ListNode current = listNode;
        while(current != null){
            temp.add(current.val);
            current = current.next;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = temp.size()-1; i <=0 ; i--) {
            res.add(temp.get(i));
        }
        return res;
    }
}
