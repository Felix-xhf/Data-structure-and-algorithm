package leetcode.dichotomy;

/*
 * @program:Exer
 *
 * @author: Felix_XHF
 *
 * @create:2021-07-21 19:27
 */
public class MainNC105 {
    /**
    * @Description: 请实现有重复数字的升序数组的二分查找给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target
     * ，写一个函数搜索 nums 中的第一个出现的target，如果目标值存在返回下标，否则返回 -1
    * @Para:
    * @Author: Mr.Felix
    * @Date:
    * @Time: 2021/7/21
    **/
    public int search (int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        int mid;

        while(left<=right){
            mid = left + (right-left)/2;
            if (nums[mid] == target){
                while(mid>0 && nums[mid] == nums[mid-1]){
                    mid--;
                }
                return mid;
            }

            if (nums[mid] > target){
                right = mid-1;
                continue;
            }
            if (nums[mid] < target){
                left = mid +1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,2,3,7,7,7,9,9,10};
        int[] nums2 = {-2,1,2};
        MainNC105 mainNC105 = new MainNC105();
        int search = mainNC105.search(nums2, 2);
        System.out.println(search);
    }
}
