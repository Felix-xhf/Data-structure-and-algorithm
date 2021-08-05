package SortTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

//从小到大
/**
* @Description: 插入排序，从大到小排序
* @Para: 输入无序数组
* @Author: Mr.Felix
* @Date:
* @Time: 2021/7/21
**/
public class InsertSort {
    public static int[] sort(int[] nums){
        int N = nums.length;
        for (int i = 0; i < N-1; i++) {

            //第i趟排序，将第i+1个元素插入到前面的i个元素中去
            //第一次的时候i=0；j从j=1开始判断
            for (int j = i+1; j >0; j--) {
                if (nums[j]>nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }

    @Test
    public void test(){
        int[] nums = {1,8,6,9,4};
        int[] sort = InsertSort.sort(nums);
        System.out.println(Arrays.toString(sort));
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ARRAYLENGTH = 8;
        int[] nums = new int[ARRAYLENGTH];
        System.out.println("请输入数组，并以回车结束：");
        for (int i = 0; i < ARRAYLENGTH; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("数组为"+ Arrays.toString(nums));
        int[] res = SelectionSort.sort(nums);
        System.out.println(Arrays.toString(res));
    }
}
