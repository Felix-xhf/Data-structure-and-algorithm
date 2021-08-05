package nowcoder.JZ7;

public class Solution {
    public static int Fibonacci(int n) {
        if (n==0){
            return 0;
        }
        int[] res = new int[n+1];
        res[0]=0;
        res[1]=1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i-1]+res[i-2];
        }
        return res[n];
    }


    public int Fibonacci1(int n) {
        if(n==0) {
            return 0;
        }

        int pre = 0;
        int cur = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = pre + cur;
            pre = cur;
            cur = temp;
        }
        return cur;
    }




    public static void main(String[] args) {
        System.out.println(Solution.Fibonacci(0));
    }
}
