package leetcode.Double_pointer;

public class Main189 {
    //双指针
    public static void rotate(int[] nums, int k) {
        if(nums.length<=1){
            return;
        }
        k=k%nums.length;

        int right = nums.length-k;
        int left = 0;
        int[] res = new int[nums.length];
        int count=0;
        while(right<=nums.length-1){
            res[count++] = nums[right++];
        }
        while (left<nums.length-k){
            res[count++] = nums[left++];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }

    //翻转数组
    public static void rotate1(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        k = k%nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    private static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        Main189.rotate1(nums,3);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
