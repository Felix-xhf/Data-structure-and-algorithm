package leetcode.Dynamic_Programming;

public class Main53 {
    /*
    * f(i)表示第i个元素结尾的【最大连续子数和】，那么问题就变为求f(i) (i属于[0,n-1])的最大值
    *
    * f(i) = max((f(i-1) + nums[i]),nums[i])
    *
    * */

    public static int maxSubArray(int[] nums) {
        int pre = 0;   //代表第i个元素结尾的最大连续子数和
        int max = Integer.MIN_VALUE;   //代表最后的结果
        for (int num : nums) {
            pre = Math.max(pre+num,num);
            max = Math.max(max,pre);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = Main53.maxSubArray(nums);
        System.out.println(i);
    }
}
