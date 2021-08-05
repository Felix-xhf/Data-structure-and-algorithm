package leetcode.Array;


//不会
public class Main53 {
    //动态规划
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];
        for (int num : nums) {
            pre = Math.max(pre+num,num);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }
}
