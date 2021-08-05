package leetcode.Dynamic_Programming;

//爬楼梯问题
public class Main70 {
    public int climbStairs(int n) {
        if (n==0 || n==1 || n==2){
            return n;
        }
        int[] res = new int[n];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        for (int i = 3; i < n; i++) {
            res[i] = climbStairs(i-1) + climbStairs(i-2);
        }
        return res[n];
    }
}
