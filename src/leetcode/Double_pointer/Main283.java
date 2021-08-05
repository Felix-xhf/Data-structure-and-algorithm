package leetcode.Double_pointer;

public class Main283 {
    public static void moveZeroes(int[] nums) {

        if(nums.length<=1){
            return;
        }


        int left=0;
        int right=1;
        while(nums[left]!=0 && left<nums.length-1){
            left++;
            right++;
        }


        while(right<nums.length){
            if (nums[right]!=0){
                nums[left++]=nums[right];
                nums[right++]=0;
            }else{
                right++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,1};
        Main283.moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
