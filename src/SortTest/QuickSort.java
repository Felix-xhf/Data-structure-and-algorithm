package SortTest;

import org.junit.Test;

import java.util.Arrays;

/*
 * @program:Exer
 *
 * @author: Felix_XHF
 *
 * @create:2021-07-21 20:26
 */
public class QuickSort {
    public void sort(int[] nums ,int start, int end){
        if (start >= end){
            return;
        }

        int high = end;
        int low = start;

        int stand = nums[start];

        while (low < high){
            //先判断一下，两边是不是一样的
            if (nums[high] == nums[low]){
                high--;
            }

            //找到左边比标准数大的数的位置索引
            while(low < high && nums[low] < stand){
                low++;
            }

            //找到右边比标准数小的数的位置索引
            while (low < high && nums[high] > stand){
                high--;
            }

            //交换
            swap(nums,low,high);
        }

        sort(nums,start,low);
        sort(nums,high+1,end);



    }

    private void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }


    @Test
    public void test(){
        int[] nums = {2, 3, 5, 3, 9, 67, 6, 5};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
}
