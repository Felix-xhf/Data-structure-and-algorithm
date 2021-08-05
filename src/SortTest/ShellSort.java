package SortTest;

import org.junit.Test;

import java.util.Arrays;

public class ShellSort {
    /**
    * @Description: 希尔排序
    * @Para:
    * @Author: Mr.Felix
    * @Time: 2021/7/21
    **/
    public static int[] sort(int[] nums){
        int h = 1;
        while (h < nums.length/2){
            h = 2*h+1;
        }
        System.out.println(h);


        while(h>=1){
            for (int i = h; i < nums.length; i++) {
                for (int j = i; j >=h ; j=j-h) {
                    if (nums[j-h] > nums[j]){
                        int temp = nums[j];
                        nums[j] = nums[j-h];
                        nums[j-h] = temp;
                    }
                }
            }
            h = h/2;
        }
        return nums;
    }


    @Test
    public void test(){
        int[] nums = {1,8,6,9,4};
        int[] sort = ShellSort.sort(nums);
        System.out.println(Arrays.toString(sort));
    }
}
