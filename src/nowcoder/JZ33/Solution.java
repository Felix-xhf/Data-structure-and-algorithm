package nowcoder.JZ33;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) {
            return 0;
        }

        //1.定义一个数组来存储所有的丑数
        int[] nums = new int[index];
        nums[0] = 1;
        //2.定义三个index来表示三个丑数的队列
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        for (int i = 1; i < index; i++) {
            //3.找到三个队列中每次提供的最小值，赋值给存丑数的数组
            nums[i] = Math.min(Math.min(nums[index1] * 2, nums[index2] * 3), nums[index3] * 5);
            //4.找到是谁给数组提供的丑数，这个队列的index++
            if (nums[i] == nums[index1] * 2) {
                index1++;
            }
            if (nums[i] == nums[index2] * 3) {
                index2++;
            }
            if (nums[i] == nums[index3] * 5) {
                index3++;
            }
            //5.返回结果
        }
        return nums[index - 1];
    }
}
