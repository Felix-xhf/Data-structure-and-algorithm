package leetcode.dichotomy;


/*
* Main34
*
*
*
* */
public class Main34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length ==  0){
            return new int[]{-1,-1};
        }
        if (nums.length == 1 && nums[0] == target){
            return new int[]{0,0};
        }
        if (nums.length == 2 && nums[0] == target && nums[1] ==target){
            return new int[]{0,1};
        }

        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        int tempLeft = -1;
        int tempRight = -1;

        while (left< right){
            mid = left + (right- left)/2;
            if (nums[mid] > target){
                right = mid-1;
                continue;
            }
            if (nums[mid] < target){
                left = mid + 1;
                continue;
            }
            tempRight = mid;
            tempLeft = mid;
            while (nums[tempLeft] == target){
                tempLeft--;
            }
            while (nums[tempRight] == target){
                tempRight++;
            }
            break;
        }
        if (tempLeft == -1 && tempRight == -1){
            return new int[]{tempLeft,tempRight};
        }else {
            return new int[]{tempLeft+1,tempRight-1};
        }
    }


    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] nums2 = {2,2};
        Main34 main34 = new Main34();
        int[] ints = main34.searchRange(nums2, 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
