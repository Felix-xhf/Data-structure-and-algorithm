package leetcode.Double_pointer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main977 {
    //暴力解法
    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    //双指针
    public static int[] sortedSquares1(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] res = new int[nums.length];
        int i = nums.length-1;
        while(left<=right){
            if (nums[left]*nums[left] < nums[right] * nums[right]){
                res[i--] = nums[right] * nums[right];
                right--;
            }else{
                res[i--] = nums[left]*nums[left];
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {-7, -3, 2, 3, 11};
        int[] ints1 = Main977.sortedSquares1(ints);
        for (int anInt : ints1) {
            System.out.println(anInt);
        }

    }
}
