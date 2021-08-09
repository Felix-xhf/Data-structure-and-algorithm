package 滑动窗口.LC643子数组最大平均数1;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-09 12:49
 */
public class Main {
    
    /*
    * @Description: 暴力解法，会超时
    * @Author: Mr.Felix
    * @Time: 2021/8/9
    **/
    public double findMaxAverage(int[] nums, int k) {


        double avg = 0.0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length-k; i++) {
            int sum = 0;
            for (int j = i; j <i+k ; j++) {
                sum += nums[j];
            }
            if (sum > max){
                max = sum;
            }
        }
        avg = (double) max/k;

        return avg;


    }



    /*
    * @Description: 滑动窗口解法
    * @Author: Mr.Felix
    * @Time: 2021/8/9
    **/
    public double findMaxAveragePlus(int[] nums, int k) {
        int fast = 0;
        int slow = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(fast<nums.length){
            sum += nums[fast];
            fast++;
            if (fast-slow == k){
                max = Math.max(max,sum);
                sum -= nums[slow];
                slow++;
            }
        }
        return (double) max/k;
    }



    public static void main(String[] args) {
        Main main = new Main();
        int[] ints = new int[]{1,12,-5,-6,50,3};
        double maxAverage = main.findMaxAveragePlus(ints, 4);
        System.out.println(maxAverage);
    }
}
