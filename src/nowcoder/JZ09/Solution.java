package nowcoder.JZ09;

public class Solution {
    public static int jumpFloorII(int target) {
        if (target<=1){
            return 1;
        }
        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= target; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(jumpFloorII(3));
    }
}
