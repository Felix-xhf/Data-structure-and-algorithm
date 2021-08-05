package leetcode.Double_pointer;

public class Main167 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while((numbers[left]+numbers[right])!=target){
            if ((numbers[left]+numbers[right])<target){
                left++;
            }else{
                right--;
            }
        }
        int[] res = new int[2];
        res[0]=left+1;
        res[1]=right+1;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] ints = Main167.twoSum(nums, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
