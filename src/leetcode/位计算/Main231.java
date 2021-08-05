package leetcode.位计算;

public class Main231 {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & n-1)== 0;
    }
}
