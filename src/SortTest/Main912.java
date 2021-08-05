package SortTest;

import org.junit.Test;
import java.util.Arrays;

//各种排序算法
//默认 按照从小到大来排序
public class Main912 {

    public int[] bubbleSort(int[] nums){
        /*
        * @Description: 冒泡排序
        * @Author: Mr.Felix
        * @Time: 2021/7/23
        **/
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            //第i次排序找到第i大的数字，然后把它放到最倒数第i个位置去
            for (int j = 0; j < len-1-i; j++) {
                if (nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        return nums;
    }

    @Test
    public void testBubbleSort(){
        int[] nums = {3,4,6,7,2,7,2,8,0};
        Main912 main912 = new Main912();
        int[] ints = main912.bubbleSort(nums);
        System.out.println(Arrays.toString(ints));
    }




    public int[] selectionSort(int[] nums) {
        /*
         * @Description: 选择排序
         * 总结：就是在后面的数组中找到最小的元素，然后依次的排到前面来
         * 1、第一次排序，找到最小的元素，首先默认，第一个位置是最小的，然后依次向后比较，将最小的数和第一个数进行交换
         * 2、第二次排序，从第二个数开始，找到最小的数，然后放到第二的位置上
         * 3、重复前面的步骤，一直到倒数第个位置为止，这样排序就结束了
         * @Author: Mr.Felix
         * @Time: 2021/7/22
         **/
        int len = nums.length;
        // len-1是因为，最后一个位置的时候，只有一个元素了，所以不需要排序了，可以直接是最大的数字了
        for (int i = 0; i < len - 1; i++) {
            //先标记最小值的索引，并非是最后的最小值的索引位置
            int minIndex = i;
            //第i次排序，需要找到第i小的数字
            for (int j = i + 1; j < len; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            //此时第i次的排序已经结束了，需要进行交换位置,只有index和i的值不一样的时候才会交换位置
            if (minIndex != i) {
                swap(nums, minIndex, i);
            }
        }
        return nums;
    }
    @Test
    public void testSelectionSort(){
        int[] nums = {3,4,6,7,2,7,2,8,0};
        Main912 main912 = new Main912();
        int[] ints = main912.selectionSort(nums);
        System.out.println(Arrays.toString(ints));
    }




    public int[] insertSort(int[] nums){
        /*
        * @Description: 插入排序
         * 从第一个元素开始，该元素可以认为已经被排序；
         * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
         * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
         * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
         * 将新元素插入到该位置后；
         * 重复步骤2~5。
        * @Para: [nums]
        * @Author: Mr.Felix
        * @Time: 2021/7/22
        **/
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            //从第2个数字开始，将后后面的元素依次插入到前面已经排序好的数组中去
            for (int j = i; j >0; j--) {
                if (nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
                }
            }
        }
        return nums;
    }
    @Test
    public void testInsertSort(){
        int[] nums = {3,4,6,7,2,7,2,8,0};
        Main912 main912 = new Main912();
        int[] ints = main912.insertSort(nums);
        System.out.println(Arrays.toString(ints));
    }


    public int[] shellSort(int[] nums){
        /*
        * @Description: 希尔排序
        * 总结：希尔排序其实就是一个分组排序，以增量为间隔进行排序，直到这个增量为1，整个排序就结束了
        * 1、定义一个增量，gap，根据增量进行分组
        * 2、给每个分组进行排序，排序完成之后进行gap除以2
        * 3、接着重复上面的过程，知道gap=1结束排序
        * @Author: Mr.Felix
        * @Time: 2021/7/22
        **/
        int len = nums.length;
        int gap = nums.length/2;
        while(gap>=1){
            for (int i = gap; i < len; i++) {
                for (int j = i; j >=gap; j = j-gap) {
                    if (nums[j] < nums[j-gap]){
                        swap(nums,j,j-gap);
                    }
                }
            }
            gap = gap/2;
        }
        return nums;
    }
    @Test
    public void testShellSort(){
        int[] nums = {3,4,6,7,2,7,2,8,0};
        Main912 main912 = new Main912();
        int[] ints = main912.shellSort(nums);
        System.out.println(Arrays.toString(ints));
    }


    /*
    * @Description: 归并排序
    * 1、把长度为n的输入序列分成两个长度为n/2的子序列；
      2、对这两个子序列分别采用归并排序；
      3、将两个排序好的子序列合并成一个最终的排序序列。
    * @Para:
    * @Author: Mr.Felix
    * @Time: 2021/7/22
    **/
    public int[] mergeSort(int[] nums){
        if (nums.length<2){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid,nums.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    private int[] merge(int[] left, int[] right){
        /*
        * @Description: 合并两个有序数组
        * @Para: [left, right]
        * @Author: Mr.Felix
        * @Time: 2021/7/22
        **/
        int[] res = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i<left.length && j<right.length){
            if (left[i] < right[j]){
                res[index++] = left[i++];
            }else{
                res[index++] = right[j++];
            }
        }
        while(i<left.length){
            res[index++] = left[i++];
        }
        while (j<right.length){
            res[index++] = right[j++];
        }
        return res;
    }


    
    public void quickSort(int[] nums,int start,int end){
        /*
        * @Description: 快速排序
        * 1、从数列中挑出一个元素，称为 “基准”（pivot）；
          2、重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
            在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
          3、递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
        * @Author: Mr.Felix
        * @Time: 2021/7/22
        **/

        //递归的退出条件
        if (start>=end){
            return;
        }

        //把数组中的第0个数字作为标准数
        int stard = nums[start];

        //记录需要排序的下标
        int low = start;
        int high = end;

        //循环找比标准数大的数  和  比标准数小的数
        while(low < high){
            //如果low 和 high索引处的值 一直的时候，就会进入死循环，所以需要有一方做出让步
            if (nums[high] == nums[low]){
                high--;
            }
            //右边的数字比标准数大，右边的索引向前移动一位
            while(low<high && stard < nums[high]){
                high--;
            }
            //左边的数字比标准数小，左边的索引向后移动一位
            while(low<high && stard > nums[low]){
                low++;
            }
            //交换索引high 和 low处的值
            swap(nums,high,low);
        }

        //处理所有小的数字
        quickSort(nums, start, low);
        //处理所有大的数字
        quickSort(nums,high+1,end);
    }

    private void swap(int[] nums, int i, int j){
        /*
        * @Description: 交换数组的两个位置
        * @Author: Mr.Felix
        * @Time: 2021/7/22
        **/
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,6,7,2,7,2,8,0};
        Main912 main912 = new Main912();
//        int[] ints = main912.quickSort(nums,0,nums.length-1);
        main912.quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
