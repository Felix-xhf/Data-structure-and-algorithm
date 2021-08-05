package nowcoder.offer_JZ37_数字在升序数组中出现的次数;


public class Solution {
    //很蠢的一个办法
    public int GetNumberOfK(int [] array , int k) {
        int res = 0;
        for(int i =0;i<array.length;i++){
            if(k == array[i]){
                res++;
            }else{
                continue;
            }
        }
        return res;
    }




    //改进
    public int GetNumberOfK2(int [] array , int k) {
        return 0;
    }
}
