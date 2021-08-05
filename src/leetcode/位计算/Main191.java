package leetcode.位计算;

public class Main191 {
    public int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            n = n & n-1;
            res++;
        }
        return res;
    }
}
