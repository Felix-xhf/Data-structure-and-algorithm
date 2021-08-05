package nowcoder.offer_JZ21_栈的压入弹出序列;

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> s = new Stack<Integer>();

        int pushIndex = 0;
        int popIndex = 0;

        while(pushIndex < pushA.length){
            if(!s.isEmpty() && s.peek()==popA[popIndex]){
                s.pop();
                popIndex++;
            }else{
                s.push(pushA[pushIndex++]);
            }
        }

        while(!s.isEmpty()){
            if(s.peek()==popA[popIndex]){
                s.pop();
                popIndex++;
            }else{
                s.pop();
            }
        }

        if(popIndex == popA.length){
            return true;
        }else{
            return false;
        }
    }
}
