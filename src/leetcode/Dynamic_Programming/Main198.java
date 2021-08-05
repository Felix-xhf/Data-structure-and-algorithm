package leetcode.Dynamic_Programming;


//你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
// 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
//给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。


public class Main198 {
    public int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        //子问题
        //f(k)代表着偷[0,k)个房间的最大金额
        int len = nums.length;
        int[] dp = new int[len+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i-1],(dp[i-2] + nums[i-1]));
        }
        return dp[len];
    }
}
