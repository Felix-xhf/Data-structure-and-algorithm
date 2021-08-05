package leetcode.dichotomy;

//搜索插入位置
public class Main35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left+(right-left)/2;
        while(left<=right){
            if (target==nums[mid]){
                return mid;
            }
            if (target>nums[mid]){
                left = mid+1;
                mid = left+(right-left)/2;
                continue;
            }
            if (target<nums[mid]){
                right = mid-1;
                mid = left+(right-left)/2;
            }
        }

        System.out.println(left);
        System.out.println(right);
        System.out.println(mid);
        if(nums[right]>target){
            return right;
        }else{
            return right+1;
        }
    }


    public static void main(String[] args) {
        int[] ints = {1,3,5,6};
        int res = Main35.searchInsert(ints,0);

        System.out.println(res);
    }

}
