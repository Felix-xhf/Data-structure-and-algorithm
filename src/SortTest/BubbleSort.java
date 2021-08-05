package SortTest;

import java.util.Arrays;
import java.util.Scanner;

//从小到大排序
/**
* @Description: 1、比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 *              2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 *              3、针对所有的元素重复以上的步骤，除了最后一个；
 *              4、重复步骤1~3，直到排序完成
* @Para:
* @Author: Mr.Felix
* @Time: 2021/7/22
**/
public class BubbleSort {
    public int[] sort(int[] nums){
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
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
