package leetcode.dichotomy;

/*
*
* 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，
* 写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
* */

public class Main704 {
    //1.暴力一次循环
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]){
                return i;
            }
        }
        return -1;
    }

    //2.二分查找
    public static int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left+(right-left)/2;
        while(left<=right){
            if (nums[mid]>target){
                right=mid-1;
                mid=left+(right-left)/2;
                continue;
            }
            if (nums[mid]<target){
                left = mid+1;
                mid=left+(right-left)/2;
                continue;
            }
            if (nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int search = Main704.search2(nums,13);
        System.out.println(search);
    }
}
