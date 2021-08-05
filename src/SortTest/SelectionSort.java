package SortTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;


/**
* @Description: 1、初始状态：无序区为R[1..n]，有序区为空；
 *              2、第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R(i..n）。
 *              该趟排序从当前无序区中-选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，
 *              使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
 *              3、n-1趟结束，数组有序化了。
* @Para:
* @Author: Mr.Felix
* @Time: 2021/7/22
**/
public class SelectionSort{
    public static int[] sort(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int min = i;  //记录最小值的位置索引
            for (int j = i+1; j < N ; j++) {
                if (nums[j] < nums[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
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

    @Test
    public void test(){
        int[] nums = {1,8,6,9,4,22,35,14,69,12,41};
        int[] sort = SelectionSort.sort(nums);
        System.out.println(Arrays.toString(sort));
    }

}
